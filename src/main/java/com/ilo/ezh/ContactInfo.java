package com.ilo.ezh;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContactInfo {

    String lineNumber; // LineNumber
    String type;       // Тип
    String vid_Key; // Вид_Key
    String predstavlenie; // Представление
    String znacheniaPolei; // ЗначенияПолей
    String strana; // Страна
    String region; // Регион
    String gorod; // Город
    String adresEP; // АдресЭП
    String domennoeImyaServera; // ДоменноеИмяСервера
    String nomerTelefona; // НомерТелефона
    String nomerTelefonaBezKodov; // НомерТелефонаБезКодов
    String vidDlyaSpiska_Key; // ВидДляСписка_Key
    LocalDateTime deistvuetS; // ДействуетС

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setVid_Key(String vid_Key) {
        this.vid_Key = vid_Key;
    }

    public void setPredstavlenie(String predstavlenie) {
        this.predstavlenie = predstavlenie;
    }

    public void setZnacheniaPolei(String znacheniaPolei) {
        this.znacheniaPolei = znacheniaPolei;
    }

    public void setStrana(String strana) {
        this.strana = strana;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setGorod(String gorod) {
        this.gorod = gorod;
    }

    public void setAdresEP(String adresEP) {
        this.adresEP = adresEP;
    }

    public void setDomennoeImyaServera(String domennoeImyaServera) {
        this.domennoeImyaServera = domennoeImyaServera;
    }

    public void setNomerTelefona(String nomerTelefona) {
        this.nomerTelefona = nomerTelefona;
    }

    public void setNomerTelefonaBezKodov(String nomerTelefonaBezKodov) {
        this.nomerTelefonaBezKodov = nomerTelefonaBezKodov;
    }

    public void setVidDlyaSpiska_Key(String vidDlyaSpiska_Key) {
        this.vidDlyaSpiska_Key = vidDlyaSpiska_Key;
    }

    public void setDeistvuetS(LocalDateTime deistvuetS) {
        this.deistvuetS = deistvuetS;
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                "lineNumber='" + lineNumber + '\'' +
                ", type='" + type + '\'' +
                ", predstavlenie='" + predstavlenie + '\'' +
                '}';
    }

   /* @Override
    public String toString() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.dd.MM HH:mm:ss");

        return "ContactInfo{" +
                "lineNumber='" + lineNumber + '\'' +
                ", type='" + type + '\'' +
                ", vid_Key='" + vid_Key + '\'' +
                ", predstavlenie='" + predstavlenie + '\'' +
                ", znacheniaPolei='" + znacheniaPolei + '\'' +
                ", strana='" + strana + '\'' +
                ", region='" + region + '\'' +
                ", gorod='" + gorod + '\'' +
                ", adresEP='" + adresEP + '\'' +
                ", domennoeImyaServera='" + domennoeImyaServera + '\'' +
                ", nomerTelefona='" + nomerTelefona + '\'' +
                ", nomerTelefonaBezKodov='" + nomerTelefonaBezKodov + '\'' +
                ", vidDlyaSpiska_Key='" + vidDlyaSpiska_Key + '\'' +
                ", deistvuetS=" + formatter.format(deistvuetS) +
                '}';
    }*/
}
