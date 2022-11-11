package facades;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.nimbusds.jose.shaded.json.JSONObject;
import dtos.ChuckDTO;
import dtos.CombinedDTO;
import dtos.CurrencyDTO;
import dtos.DadDTO;
import utils.HttpUtils;

import java.io.IOException;

public class CurrencyFetcher {

    public static void main(String[] args) throws IOException {

    }
    public static void getCurrency() throws IOException {

        String currencies = HttpUtils.fetchData("https://api.apilayer.com/exchangerates_data/symbols");
    }
}
