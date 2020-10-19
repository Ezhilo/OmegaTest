package com.ilo.ezh;

import java.util.List;

public class Entry {

    String ref_Key;
    String dataVersion;
    Boolean deletionMark;
    String parentKey;
    Boolean isFolder;
    String code;
    String description;
    String gruppaDosupaKey; // ГруппаДоступа_Key
    Long INN; // ИНН
    String kodPoOKPO; // КодПоОКПО
    String commentary; // Комментарий
    String KPP; // КПП
    String naimenovaniePolnoe; //НаименованиеПолное
    String osnovnnoiBankovskiiSchetKey; // ОсновнойБанковскийСчет_Key
    String otvetstvennyKey; // Ответственный_Key
    String registracionnyNomer; // РегистрационныйНомер
    String fizLicoKey; //ФизЛицо_Key
    String urFizLico; //ЮрФизЛицо
    String sfpCoMagicID; //сфпCoMagicID
    Boolean Predefined;
    String PredefinedDataName;
    List<AdditionalProperty> DopolnitelnieRekviziti;
    List<ContactInfo> ContaktnayaInformacia; // КонтактнаяИнформация

    @Override
    public String toString() {
        return "Entry{" +
                "ref_Key='" + ref_Key + '\'' +
                ", description='" + description + '\'' +
                ", ContaktnayaInformacia=" + ContaktnayaInformacia +
                '}';
    }

/*    @Override
    public String toString() {
        return "Entry{" +
                "ref_Key='" + ref_Key + '\'' +
                ", dataVersion='" + dataVersion + '\'' +
                ", deletionMark=" + deletionMark +
                ", parentKey='" + parentKey + '\'' +
                ", isFolder=" + isFolder +
                ", code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", gruppaDosupaKey='" + gruppaDosupaKey + '\'' +
                ", INN=" + INN +
                ", kodPoOKPO='" + kodPoOKPO + '\'' +
                ", commentary='" + commentary + '\'' +
                ", KPP='" + KPP + '\'' +
                ", naimenovaniePolnoe='" + naimenovaniePolnoe + '\'' +
                ", osnovnnoiBankovskiiSchetKey='" + osnovnnoiBankovskiiSchetKey + '\'' +
                ", otvetstvennyKey='" + otvetstvennyKey + '\'' +
                ", registracionnyNomer='" + registracionnyNomer + '\'' +
                ", fizLicoKey='" + fizLicoKey + '\'' +
                ", urFizLico='" + urFizLico + '\'' +
                ", sfpCoMagicID='" + sfpCoMagicID + '\'' +
                ", Predefined=" + Predefined +
                ", PredefinedDataName='" + PredefinedDataName + '\'' +
                ", DopolnitelnieRekviziti=" + DopolnitelnieRekviziti +
                ", ContaktnayaInformacia=" + ContaktnayaInformacia +
                '}';
    }*/

    public void setDopolnitelnieRekviziti(List<AdditionalProperty> dopolnitelnieRekviziti) {
        DopolnitelnieRekviziti = dopolnitelnieRekviziti;
    }

    public void setContaktnayaInformacia(List<ContactInfo> contaktnayaInformacia) {
        ContaktnayaInformacia = contaktnayaInformacia;
    }

    public void setFolder(Boolean folder) {
        isFolder = folder;
    }

    public void setPredefined(Boolean predefined) {
        Predefined = predefined;
    }

    public void setPredefinedDataName(String predefinedDataName) {
        PredefinedDataName = predefinedDataName;
    }

    public void setRef_Key(String ref_Key) {
        this.ref_Key = ref_Key;
    }

    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }

    public void setDeletionMark(Boolean deletionMark) {
        this.deletionMark = deletionMark;
    }

    public void setParentKey(String parentKey) {
        this.parentKey = parentKey;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setGruppaDosupaKey(String gruppaDosupaKey) {
        this.gruppaDosupaKey = gruppaDosupaKey;
    }

    public void setINN(Long INN) {
        this.INN = INN;
    }

    public void setKodPoOKPO(String kodPoOKPO) {
        this.kodPoOKPO = kodPoOKPO;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public void setKPP(String KPP) {
        this.KPP = KPP;
    }

    public void setNaimenovaniePolnoe(String naimenovaniePolnoe) {
        this.naimenovaniePolnoe = naimenovaniePolnoe;
    }

    public void setOsnovnnoiBankovskiiSchetKey(String osnovnnoiBankovskiiSchetKey) {
        this.osnovnnoiBankovskiiSchetKey = osnovnnoiBankovskiiSchetKey;
    }

    public void setOtvetstvennyKey(String otvetstvennyKey) {
        this.otvetstvennyKey = otvetstvennyKey;
    }

    public void setRegistracionnyNomer(String registracionnyNomer) {
        this.registracionnyNomer = registracionnyNomer;
    }

    public void setFizLicoKey(String fizLicoKey) {
        this.fizLicoKey = fizLicoKey;
    }

    public void setUrFizLico(String urFizLico) {
        this.urFizLico = urFizLico;
    }

    public void setSfpCoMagicID(String sfpCoMagicID) {
        this.sfpCoMagicID = sfpCoMagicID;
    }

}
