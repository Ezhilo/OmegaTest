package com.ilo.ezh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class OmegaParser {

    private static final int MAX_COUNTER = 100;
    private static boolean endOfFile = false;

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Error! No find filename in first argument!");
            return;
        }
        //String fileName = "D:/Test/template.xml";
        //String fileName = "D:/Test/template.xml";
        String fileName = args[0];
        List<Entry> entryList;

        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        try {
            XMLEventReader reader = xmlInputFactory.createXMLEventReader(new FileInputStream(fileName));
            int portionCount = 1;
            while (!endOfFile) {
                entryList = parseXMLfile(reader);
                System.out.println("Portion " + portionCount++);
                addToDB(entryList);
            }

        } catch (FileNotFoundException | XMLStreamException exc) {
            exc.printStackTrace();
        }

    }

    private static void addToDB(List<Entry> entryList) {

        // Adding to DB
        // replaced by sout into console
        entryList.forEach(System.out::println);

    }

    private static List<Entry> parseXMLfile(XMLEventReader reader) throws XMLStreamException {

        List<Entry> entryList = new ArrayList<>();
        Entry entry = null;
        List<ContactInfo> contactInfos = null;
        ContactInfo contactInfoRow = null;

        int counter = 0;

        while (reader.hasNext()) {
            // получаем событие (элемент) и разбираем его по атрибутам
            XMLEvent xmlEvent = reader.nextEvent();
            if (xmlEvent.isStartElement()) {
                StartElement startElement = xmlEvent.asStartElement();
                if (startElement.getName().getLocalPart().equals("entry")) {
                    entry = new Entry();
                    //Attribute idAttr = startElement.getAttributeByName(new QName("id"));
                    //    if (idAttr != null) {
                    //        entry.setId(Integer.parseInt(idAttr.getValue()));
                    //    }
                } else if (startElement.getName().getLocalPart().equals("Ref_Key")) {
                    entry.setRef_Key(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("DataVersion")) {
                    entry.setDataVersion(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("DeletionMark")) {
                    entry.setDeletionMark(Boolean.parseBoolean(getValue(reader, "false")));
                } else if (startElement.getName().getLocalPart().equals("Parent_Key")) {
                    entry.setParentKey(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("IsFolder")) {
                    entry.setFolder(Boolean.parseBoolean(getValue(reader, "false")));
                } else if (startElement.getName().getLocalPart().equals("Code")) {
                    entry.setCode(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("Description")) {
                    entry.setDescription(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("ГруппаДоступа_Key")) {
                    entry.setGruppaDosupaKey(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("ИНН")) {
                    try {
                        entry.setINN(Long.parseLong(getValue(reader, "0")));
                    } catch (NumberFormatException e) {
                        entry.setINN(0L);
                    }
                } else if (startElement.getName().getLocalPart().equals("КодПоОКПО")) {
                    entry.setKodPoOKPO(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("Комментарий")) {
                    entry.setCommentary(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("КПП")) {
                    entry.setKPP(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("НаименованиеПолное")) {
                    entry.setNaimenovaniePolnoe(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("ОсновнойБанковскийСчет_Key")) {
                    entry.setOsnovnnoiBankovskiiSchetKey(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("Ответственный_Key")) {
                    entry.setOtvetstvennyKey(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("РегистрационныйНомер")) {
                    entry.setRegistracionnyNomer(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("ФизЛицо_Key")) {
                    entry.setFizLicoKey(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("ЮрФизЛицо")) {
                    entry.setUrFizLico(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("сфпCoMagicID")) {
                    entry.setSfpCoMagicID(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("Predefined")) {
                    entry.setPredefined(Boolean.parseBoolean(getValue(reader, "false")));
                } else if (startElement.getName().getLocalPart().equals("PredefinedDataName")) {
                    entry.setPredefinedDataName(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("КонтактнаяИнформация")) {
                    contactInfos = new ArrayList<>();
                } else if (startElement.getName().getLocalPart().equals("element")) {
                    contactInfoRow = new ContactInfo();
                } else if (startElement.getName().getLocalPart().equals("LineNumber")) {
                    contactInfoRow.setLineNumber(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("Тип")) {
                    contactInfoRow.setType(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("Вид_Key")) {
                    contactInfoRow.setVid_Key(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("Представление")) {
                    contactInfoRow.setPredstavlenie(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("ЗначенияПолей")) {
                    contactInfoRow.setZnacheniaPolei(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("Страна")) {
                    contactInfoRow.setStrana(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("Регион")) {
                    contactInfoRow.setRegion(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("Город")) {
                    contactInfoRow.setGorod(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("АдресЭП")) {
                    contactInfoRow.setAdresEP(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("ДоменноеИмяСервера")) {
                    contactInfoRow.setDomennoeImyaServera(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("НомерТелефона")) {
                    contactInfoRow.setDomennoeImyaServera(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("НомерТелефонаБезКодов")) {
                    contactInfoRow.setNomerTelefonaBezKodov(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("ВидДляСписка_Key")) {
                    contactInfoRow.setVidDlyaSpiska_Key(getValue(reader));
                } else if (startElement.getName().getLocalPart().equals("ДействуетС")) {
                    contactInfoRow.setDeistvuetS(LocalDateTime.parse(getValue(reader)));
                }

            }

            if (xmlEvent.isEndElement()) {
                EndElement endElement = xmlEvent.asEndElement();
                if (endElement.getName().getLocalPart().equals("entry")) {
                    entryList.add(entry);
                    counter++;
                    if (counter > MAX_COUNTER) {
                        return entryList;
                    }
                } else if (endElement.getName().getLocalPart().equals("КонтактнаяИнформация")) {
                    entry.setContaktnayaInformacia(contactInfos);
                } else if (endElement.getName().getLocalPart().equals("element")) {
                    contactInfos.add(contactInfoRow);
                }
            }
        }

        endOfFile = true;
        return entryList;

    }

    private static String getValue(XMLEventReader reader, String defaultValue) throws XMLStreamException {

        XMLEvent xmlEvent = reader.nextEvent();
        return xmlEvent.isEndElement() ? defaultValue : xmlEvent.asCharacters().getData().trim();

    }

    private static String getValue(XMLEventReader reader) throws XMLStreamException {
        return getValue(reader, "");
    }

}

