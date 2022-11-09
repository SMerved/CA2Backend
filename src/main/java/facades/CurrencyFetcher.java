package facades;

import com.google.gson.Gson;
import dtos.ChuckDTO;
import dtos.CombinedDTO;
import dtos.CurrencyDTO;
import dtos.DadDTO;
import utils.HttpUtils;

import java.io.IOException;

public class CurrencyFetcher {
    public static CurrencyDTO getCurrency() throws IOException {

        String currency = HttpUtils.fetchData("https://api.chucknorris.io/jokes/random");

        Gson gson = new Gson();

        ChuckDTO chuckDTO = gson.fromJson(chuck, ChuckDTO.class);


        return new currencyDTO;
    }
}
