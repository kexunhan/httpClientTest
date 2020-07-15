import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;

import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class Test {

    public static void main(String[] args) {

        String url="https://pub.alimama.com/report/getTbkOrderDetails.json?spm=a219t.11816981.0.0.1b8d6a151CmUrf&downloadId=DOWNLOAD_REPORT_ORDER_DETAILS&startTime=2020-07-8&endTime=2020-07-13&queryType=2&tkStatus=&memberType=";
        String cookie="t=51cf96a53eef25c4add7559684859569; cna=2CpvFyhFyi8CAXUMylrriV42; 30353156-payment-time=true; cookie2=1fe655c6a7cdd87e75b41b5a81a48512; v=0; _tb_token_=fae73b6437575; rurl=aHR0cDovL3B1Yi5hbGltYW1hLmNvbS9yZXBvcnQvZ2V0VGJrT3JkZXJEZXRhaWxzLmpzb24%2Fc3BtPWEyMTl0LjExODE2OTgxLjAuMC4xYjhkNmExNTFDbVVyZiZkb3dubG9hZElkPURPV05MT0FEX1JFUE9SVF9PUkRFUl9ERVRBSUxTJnN0YXJ0VGltZT0yMDIwLTA3LTEzJmVuZFRpbWU9MjAyMC0wNy0xMyZxdWVyeVR5cGU9MiZ0a1N0YXR1cz0mbWVtYmVyVHlwZT0%3D; alimamapwag=TW96aWxsYS81LjAgKE1hY2ludG9zaDsgSW50ZWwgTWFjIE9TIFggMTBfMTVfNSkgQXBwbGVXZWJLaXQvNTM3LjM2IChLSFRNTCwgbGlrZSBHZWNrbykgQ2hyb21lLzgzLjAuNDEwMy4xMTYgU2FmYXJpLzUzNy4zNg%3D%3D; cookie32=9e7bf2360434d2eb75ef14c968f5877c; alimamapw=RHUCQXsFRCRWHCVUFnsJRHwiaAYEAAwDAFFUCQRRBAACAl5WAgUGVwtXUFFSX1JVV1xS; cookie31=MzAzNTMxNTYsJUU3JUJFJThFJUU5JTgxJTkzJUU5JUE2JTg2LHRoZWFteXNob3BAeWFob28uY24sVEI%3D; login=UtASsssmOIJ0bQ%3D%3D; isg=BMrKqWmxoQlWxC2vWMBvJXoOG7Zsu04V-oA-8VQC2p2CB2jBPE7fJVUxF3Pb98at; l=eBMB8ZMPOjpzienwBO5Churza77TPIdbzsPzaNbMiInca6w1_GqXANQq9c-y8dtjgtfAYetyZPH3jR3eri4N2oJsNAFpRXtFzYpNI";

        HttpResponse response = HttpRequest.get(url).header("cookie", cookie).executeAsync();

        long l = response.writeBody("/Users/kxhan/test/aaa");

        System.out.println(l);

    }
}
