/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.pizduk.Pizduk;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Main {
  public static void main(String[] args) {
    // Initialize Api Context
    ApiContextInitializer.init();

    // Instantiate Telegram Bots API
    TelegramBotsApi botsApi = new TelegramBotsApi();

    // Register our bot
    try {
      botsApi.registerBot(new Pizduk());
    } catch (TelegramApiException e) {
      e.printStackTrace();
    }
  }
}