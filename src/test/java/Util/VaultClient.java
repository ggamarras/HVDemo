package Util;

import com.bettercloud.vault.Vault;
import com.bettercloud.vault.VaultConfig;
import com.bettercloud.vault.response.LogicalResponse;

import java.util.Map;

public class VaultClient {
    public static String getSecret(String key) throws Exception {
        VaultConfig config = new VaultConfig()
                .address("http://localhost:8200")
                .token("mitoken09542946")
                .build();

        Vault vault = new Vault(config);
        LogicalResponse response = vault.logical().read("secret/login"); // sin "data" si es KV v1

        Map<String, String> data = response.getData();
        if (data == null || !data.containsKey(key)) {
            throw new IllegalArgumentException("No se encontró la clave '" + key + "' en Vault.");
        }

        return data.get(key);
    }
}