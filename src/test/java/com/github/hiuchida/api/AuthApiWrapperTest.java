package com.github.hiuchida.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import io.swagger.client.api.TestConsts;
import io.swagger.client.model.TokenSuccess;

/**
 * API tests for AuthApiWrapper
 */
// @Disabled
public class AuthApiWrapperTest {

	private final AuthApiWrapper api = new AuthApiWrapper();

    /**
     * トークン発行
     *
     * APIトークンを発行します。&lt;br&gt; 発行したトークンは有効である限り使用することができ、リクエストごとに発行する必要はありません。&lt;br&gt; 発行されたAPIトークンは以下のタイミングで無効となります。&lt;br&gt; ・kabuステーションを終了した時&lt;br&gt; ・kabuステーションからログアウトした時&lt;br&gt; ・別のトークンが新たに発行された時&lt;br&gt; ※kabuステーションは早朝、強制的にログアウトいたしますのでご留意ください。&lt;br&gt;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void tokenPostTest() throws Exception {
        TokenSuccess response = api.tokenPost(TestConsts.API_PASSWORD);

        // TODO: test validations
        System.out.println(response);
        assertEquals(0, (int) response.getResultCode());
        assertNotNull(response.getToken());
    }

}
