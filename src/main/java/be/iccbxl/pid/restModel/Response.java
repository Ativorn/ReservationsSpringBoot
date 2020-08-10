package be.iccbxl.pid.restModel;

import lombok.Data;

import java.io.Serializable;

@Data
public class Response implements Serializable {

    private int page;

    private int pageCount;

    private int resultCount;

    private Results results;
}
/**
 * ==================================
 * package ;
 * import java.util.ArrayList;
 * import java.util.List;
 * public class Translations
 * {
 * private List<String> en;
 * <p>
 * private List<String> fr;
 * <p>
 * private List<String> nl;
 * <p>
 * public void setEn(List<String> en){
 * this.en = en;
 * }
 * public List<String> getEn(){
 * return this.en;
 * }
 * public void setFr(List<String> fr){
 * this.fr = fr;
 * }
 * public List<String> getFr(){
 * return this.fr;
 * }
 * public void setNl(List<String> nl){
 * this.nl = nl;
 * }
 * public List<String> getNl(){
 * return this.nl;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Hours
 * {
 * private String start;
 * <p>
 * private String end;
 * <p>
 * public void setStart(String start){
 * this.start = start;
 * }
 * public String getStart(){
 * return this.start;
 * }
 * public void setEnd(String end){
 * this.end = end;
 * }
 * public String getEnd(){
 * return this.end;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Sunday
 * {
 * private Hours hours;
 * <p>
 * private boolean is_open;
 * <p>
 * public void setHours(Hours hours){
 * this.hours = hours;
 * }
 * public Hours getHours(){
 * return this.hours;
 * }
 * public void setIs_open(boolean is_open){
 * this.is_open = is_open;
 * }
 * public boolean getIs_open(){
 * return this.is_open;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Hours
 * {
 * private String start;
 * <p>
 * private String end;
 * <p>
 * public void setStart(String start){
 * this.start = start;
 * }
 * public String getStart(){
 * return this.start;
 * }
 * public void setEnd(String end){
 * this.end = end;
 * }
 * public String getEnd(){
 * return this.end;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Saturday
 * {
 * private Hours hours;
 * <p>
 * private boolean is_open;
 * <p>
 * public void setHours(Hours hours){
 * this.hours = hours;
 * }
 * public Hours getHours(){
 * return this.hours;
 * }
 * public void setIs_open(boolean is_open){
 * this.is_open = is_open;
 * }
 * public boolean getIs_open(){
 * return this.is_open;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Hours
 * {
 * private String start;
 * <p>
 * private String end;
 * <p>
 * public void setStart(String start){
 * this.start = start;
 * }
 * public String getStart(){
 * return this.start;
 * }
 * public void setEnd(String end){
 * this.end = end;
 * }
 * public String getEnd(){
 * return this.end;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Tuesday
 * {
 * private Hours hours;
 * <p>
 * private boolean is_open;
 * <p>
 * public void setHours(Hours hours){
 * this.hours = hours;
 * }
 * public Hours getHours(){
 * return this.hours;
 * }
 * public void setIs_open(boolean is_open){
 * this.is_open = is_open;
 * }
 * public boolean getIs_open(){
 * return this.is_open;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Hours
 * {
 * private String start;
 * <p>
 * private String end;
 * <p>
 * public void setStart(String start){
 * this.start = start;
 * }
 * public String getStart(){
 * return this.start;
 * }
 * public void setEnd(String end){
 * this.end = end;
 * }
 * public String getEnd(){
 * return this.end;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Wednesday
 * {
 * private Hours hours;
 * <p>
 * private boolean is_open;
 * <p>
 * public void setHours(Hours hours){
 * this.hours = hours;
 * }
 * public Hours getHours(){
 * return this.hours;
 * }
 * public void setIs_open(boolean is_open){
 * this.is_open = is_open;
 * }
 * public boolean getIs_open(){
 * return this.is_open;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Hours
 * {
 * private String start;
 * <p>
 * private String end;
 * <p>
 * public void setStart(String start){
 * this.start = start;
 * }
 * public String getStart(){
 * return this.start;
 * }
 * public void setEnd(String end){
 * this.end = end;
 * }
 * public String getEnd(){
 * return this.end;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Thursday
 * {
 * private Hours hours;
 * <p>
 * private boolean is_open;
 * <p>
 * public void setHours(Hours hours){
 * this.hours = hours;
 * }
 * public Hours getHours(){
 * return this.hours;
 * }
 * public void setIs_open(boolean is_open){
 * this.is_open = is_open;
 * }
 * public boolean getIs_open(){
 * return this.is_open;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Hours
 * {
 * private String start;
 * <p>
 * private String end;
 * <p>
 * public void setStart(String start){
 * this.start = start;
 * }
 * public String getStart(){
 * return this.start;
 * }
 * public void setEnd(String end){
 * this.end = end;
 * }
 * public String getEnd(){
 * return this.end;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Friday
 * {
 * private Hours hours;
 * <p>
 * private boolean is_open;
 * <p>
 * public void setHours(Hours hours){
 * this.hours = hours;
 * }
 * public Hours getHours(){
 * return this.hours;
 * }
 * public void setIs_open(boolean is_open){
 * this.is_open = is_open;
 * }
 * public boolean getIs_open(){
 * return this.is_open;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Monday
 * {
 * private boolean is_open;
 * <p>
 * public void setIs_open(boolean is_open){
 * this.is_open = is_open;
 * }
 * public boolean getIs_open(){
 * return this.is_open;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Days
 * {
 * private Sunday sunday;
 * <p>
 * private Saturday saturday;
 * <p>
 * private Tuesday tuesday;
 * <p>
 * private Wednesday wednesday;
 * <p>
 * private Thursday thursday;
 * <p>
 * private Friday friday;
 * <p>
 * private Monday monday;
 * <p>
 * public void setSunday(Sunday sunday){
 * this.sunday = sunday;
 * }
 * public Sunday getSunday(){
 * return this.sunday;
 * }
 * public void setSaturday(Saturday saturday){
 * this.saturday = saturday;
 * }
 * public Saturday getSaturday(){
 * return this.saturday;
 * }
 * public void setTuesday(Tuesday tuesday){
 * this.tuesday = tuesday;
 * }
 * public Tuesday getTuesday(){
 * return this.tuesday;
 * }
 * public void setWednesday(Wednesday wednesday){
 * this.wednesday = wednesday;
 * }
 * public Wednesday getWednesday(){
 * return this.wednesday;
 * }
 * public void setThursday(Thursday thursday){
 * this.thursday = thursday;
 * }
 * public Thursday getThursday(){
 * return this.thursday;
 * }
 * public void setFriday(Friday friday){
 * this.friday = friday;
 * }
 * public Friday getFriday(){
 * return this.friday;
 * }
 * public void setMonday(Monday monday){
 * this.monday = monday;
 * }
 * public Monday getMonday(){
 * return this.monday;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Weekschema
 * {
 * private DateTime date_start;
 * <p>
 * private Translations translations;
 * <p>
 * private Days days;
 * <p>
 * private DateTime date_end;
 * <p>
 * public void setDate_start(DateTime date_start){
 * this.date_start = date_start;
 * }
 * public DateTime getDate_start(){
 * return this.date_start;
 * }
 * public void setTranslations(Translations translations){
 * this.translations = translations;
 * }
 * public Translations getTranslations(){
 * return this.translations;
 * }
 * public void setDays(Days days){
 * this.days = days;
 * }
 * public Days getDays(){
 * return this.days;
 * }
 * public void setDate_end(DateTime date_end){
 * this.date_end = date_end;
 * }
 * public DateTime getDate_end(){
 * return this.date_end;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class En
 * {
 * private String copyright;
 * <p>
 * private String title;
 * <p>
 * public void setCopyright(String copyright){
 * this.copyright = copyright;
 * }
 * public String getCopyright(){
 * return this.copyright;
 * }
 * public void setTitle(String title){
 * this.title = title;
 * }
 * public String getTitle(){
 * return this.title;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Fr
 * {
 * private String copyright;
 * <p>
 * private String title;
 * <p>
 * public void setCopyright(String copyright){
 * this.copyright = copyright;
 * }
 * public String getCopyright(){
 * return this.copyright;
 * }
 * public void setTitle(String title){
 * this.title = title;
 * }
 * public String getTitle(){
 * return this.title;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Nl
 * {
 * private String copyright;
 * <p>
 * private String title;
 * <p>
 * public void setCopyright(String copyright){
 * this.copyright = copyright;
 * }
 * public String getCopyright(){
 * return this.copyright;
 * }
 * public void setTitle(String title){
 * this.title = title;
 * }
 * public String getTitle(){
 * return this.title;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Translations
 * {
 * private En en;
 * <p>
 * private Fr fr;
 * <p>
 * private Nl nl;
 * <p>
 * public void setEn(En en){
 * this.en = en;
 * }
 * public En getEn(){
 * return this.en;
 * }
 * public void setFr(Fr fr){
 * this.fr = fr;
 * }
 * public Fr getFr(){
 * return this.fr;
 * }
 * public void setNl(Nl nl){
 * this.nl = nl;
 * }
 * public Nl getNl(){
 * return this.nl;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Media
 * {
 * private Translations translations;
 * <p>
 * private String link;
 * <p>
 * private int width;
 * <p>
 * private String type;
 * <p>
 * private int height;
 * <p>
 * private double ratio;
 * <p>
 * public void setTranslations(Translations translations){
 * this.translations = translations;
 * }
 * public Translations getTranslations(){
 * return this.translations;
 * }
 * public void setLink(String link){
 * this.link = link;
 * }
 * public String getLink(){
 * return this.link;
 * }
 * public void setWidth(int width){
 * this.width = width;
 * }
 * public int getWidth(){
 * return this.width;
 * }
 * public void setType(String type){
 * this.type = type;
 * }
 * public String getType(){
 * return this.type;
 * }
 * public void setHeight(int height){
 * this.height = height;
 * }
 * public int getHeight(){
 * return this.height;
 * }
 * public void setRatio(double ratio){
 * this.ratio = ratio;
 * }
 * public double getRatio(){
 * return this.ratio;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * import java.util.ArrayList;
 * import java.util.List;
 * public class Translations
 * {
 * private List<String> en;
 * <p>
 * private List<String> fr;
 * <p>
 * private List<String> nl;
 * <p>
 * public void setEn(List<String> en){
 * this.en = en;
 * }
 * public List<String> getEn(){
 * return this.en;
 * }
 * public void setFr(List<String> fr){
 * this.fr = fr;
 * }
 * public List<String> getFr(){
 * return this.fr;
 * }
 * public void setNl(List<String> nl){
 * this.nl = nl;
 * }
 * public List<String> getNl(){
 * return this.nl;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * import java.util.ArrayList;
 * import java.util.List;
 * public class Visit_profile
 * {
 * private Translations translations;
 * <p>
 * private List<int> list;
 * <p>
 * public void setTranslations(Translations translations){
 * this.translations = translations;
 * }
 * public Translations getTranslations(){
 * return this.translations;
 * }
 * public void setList(List<int> list){
 * this.list = list;
 * }
 * public List<int> getList(){
 * return this.list;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * import java.util.ArrayList;
 * import java.util.List;
 * public class Translations
 * {
 * private List<String> en;
 * <p>
 * private List<String> fr;
 * <p>
 * private List<String> nl;
 * <p>
 * public void setEn(List<String> en){
 * this.en = en;
 * }
 * public List<String> getEn(){
 * return this.en;
 * }
 * public void setFr(List<String> fr){
 * this.fr = fr;
 * }
 * public List<String> getFr(){
 * return this.fr;
 * }
 * public void setNl(List<String> nl){
 * this.nl = nl;
 * }
 * public List<String> getNl(){
 * return this.nl;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * import java.util.ArrayList;
 * import java.util.List;
 * public class Accessibilities
 * {
 * private Translations translations;
 * <p>
 * private List<int> list;
 * <p>
 * public void setTranslations(Translations translations){
 * this.translations = translations;
 * }
 * public Translations getTranslations(){
 * return this.translations;
 * }
 * public void setList(List<int> list){
 * this.list = list;
 * }
 * public List<int> getList(){
 * return this.list;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * import java.util.ArrayList;
 * import java.util.List;
 * public class Translations
 * {
 * private List<String> en;
 * <p>
 * private List<String> fr;
 * <p>
 * private List<String> nl;
 * <p>
 * public void setEn(List<String> en){
 * this.en = en;
 * }
 * public List<String> getEn(){
 * return this.en;
 * }
 * public void setFr(List<String> fr){
 * this.fr = fr;
 * }
 * public List<String> getFr(){
 * return this.fr;
 * }
 * public void setNl(List<String> nl){
 * this.nl = nl;
 * }
 * public List<String> getNl(){
 * return this.nl;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * import java.util.ArrayList;
 * import java.util.List;
 * public class Targets
 * {
 * private Translations translations;
 * <p>
 * private List<int> list;
 * <p>
 * public void setTranslations(Translations translations){
 * this.translations = translations;
 * }
 * public Translations getTranslations(){
 * return this.translations;
 * }
 * public void setList(List<int> list){
 * this.list = list;
 * }
 * public List<int> getList(){
 * return this.list;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class De
 * {
 * private String website;
 * <p>
 * private String shortdescr;
 * <p>
 * private String performers;
 * <p>
 * private String phone_contact;
 * <p>
 * private String agenda_url;
 * <p>
 * private String boxoffice_url;
 * <p>
 * private String longdescr;
 * <p>
 * private String name;
 * <p>
 * private String phone_booking;
 * <p>
 * private String email;
 * <p>
 * public void setWebsite(String website){
 * this.website = website;
 * }
 * public String getWebsite(){
 * return this.website;
 * }
 * public void setShortdescr(String shortdescr){
 * this.shortdescr = shortdescr;
 * }
 * public String getShortdescr(){
 * return this.shortdescr;
 * }
 * public void setPerformers(String performers){
 * this.performers = performers;
 * }
 * public String getPerformers(){
 * return this.performers;
 * }
 * public void setPhone_contact(String phone_contact){
 * this.phone_contact = phone_contact;
 * }
 * public String getPhone_contact(){
 * return this.phone_contact;
 * }
 * public void setAgenda_url(String agenda_url){
 * this.agenda_url = agenda_url;
 * }
 * public String getAgenda_url(){
 * return this.agenda_url;
 * }
 * public void setBoxoffice_url(String boxoffice_url){
 * this.boxoffice_url = boxoffice_url;
 * }
 * public String getBoxoffice_url(){
 * return this.boxoffice_url;
 * }
 * public void setLongdescr(String longdescr){
 * this.longdescr = longdescr;
 * }
 * public String getLongdescr(){
 * return this.longdescr;
 * }
 * public void setName(String name){
 * this.name = name;
 * }
 * public String getName(){
 * return this.name;
 * }
 * public void setPhone_booking(String phone_booking){
 * this.phone_booking = phone_booking;
 * }
 * public String getPhone_booking(){
 * return this.phone_booking;
 * }
 * public void setEmail(String email){
 * this.email = email;
 * }
 * public String getEmail(){
 * return this.email;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Pt
 * {
 * private String website;
 * <p>
 * private String shortdescr;
 * <p>
 * private String performers;
 * <p>
 * private String phone_contact;
 * <p>
 * private String agenda_url;
 * <p>
 * private String boxoffice_url;
 * <p>
 * private String longdescr;
 * <p>
 * private String name;
 * <p>
 * private String phone_booking;
 * <p>
 * private String email;
 * <p>
 * public void setWebsite(String website){
 * this.website = website;
 * }
 * public String getWebsite(){
 * return this.website;
 * }
 * public void setShortdescr(String shortdescr){
 * this.shortdescr = shortdescr;
 * }
 * public String getShortdescr(){
 * return this.shortdescr;
 * }
 * public void setPerformers(String performers){
 * this.performers = performers;
 * }
 * public String getPerformers(){
 * return this.performers;
 * }
 * public void setPhone_contact(String phone_contact){
 * this.phone_contact = phone_contact;
 * }
 * public String getPhone_contact(){
 * return this.phone_contact;
 * }
 * public void setAgenda_url(String agenda_url){
 * this.agenda_url = agenda_url;
 * }
 * public String getAgenda_url(){
 * return this.agenda_url;
 * }
 * public void setBoxoffice_url(String boxoffice_url){
 * this.boxoffice_url = boxoffice_url;
 * }
 * public String getBoxoffice_url(){
 * return this.boxoffice_url;
 * }
 * public void setLongdescr(String longdescr){
 * this.longdescr = longdescr;
 * }
 * public String getLongdescr(){
 * return this.longdescr;
 * }
 * public void setName(String name){
 * this.name = name;
 * }
 * public String getName(){
 * return this.name;
 * }
 * public void setPhone_booking(String phone_booking){
 * this.phone_booking = phone_booking;
 * }
 * public String getPhone_booking(){
 * return this.phone_booking;
 * }
 * public void setEmail(String email){
 * this.email = email;
 * }
 * public String getEmail(){
 * return this.email;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class En
 * {
 * private String website;
 * <p>
 * private String shortdescr;
 * <p>
 * private String performers;
 * <p>
 * private String phone_contact;
 * <p>
 * private String agenda_url;
 * <p>
 * private String boxoffice_url;
 * <p>
 * private String longdescr;
 * <p>
 * private String name;
 * <p>
 * private String phone_booking;
 * <p>
 * private String email;
 * <p>
 * public void setWebsite(String website){
 * this.website = website;
 * }
 * public String getWebsite(){
 * return this.website;
 * }
 * public void setShortdescr(String shortdescr){
 * this.shortdescr = shortdescr;
 * }
 * public String getShortdescr(){
 * return this.shortdescr;
 * }
 * public void setPerformers(String performers){
 * this.performers = performers;
 * }
 * public String getPerformers(){
 * return this.performers;
 * }
 * public void setPhone_contact(String phone_contact){
 * this.phone_contact = phone_contact;
 * }
 * public String getPhone_contact(){
 * return this.phone_contact;
 * }
 * public void setAgenda_url(String agenda_url){
 * this.agenda_url = agenda_url;
 * }
 * public String getAgenda_url(){
 * return this.agenda_url;
 * }
 * public void setBoxoffice_url(String boxoffice_url){
 * this.boxoffice_url = boxoffice_url;
 * }
 * public String getBoxoffice_url(){
 * return this.boxoffice_url;
 * }
 * public void setLongdescr(String longdescr){
 * this.longdescr = longdescr;
 * }
 * public String getLongdescr(){
 * return this.longdescr;
 * }
 * public void setName(String name){
 * this.name = name;
 * }
 * public String getName(){
 * return this.name;
 * }
 * public void setPhone_booking(String phone_booking){
 * this.phone_booking = phone_booking;
 * }
 * public String getPhone_booking(){
 * return this.phone_booking;
 * }
 * public void setEmail(String email){
 * this.email = email;
 * }
 * public String getEmail(){
 * return this.email;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class It
 * {
 * private String website;
 * <p>
 * private String shortdescr;
 * <p>
 * private String performers;
 * <p>
 * private String phone_contact;
 * <p>
 * private String agenda_url;
 * <p>
 * private String boxoffice_url;
 * <p>
 * private String longdescr;
 * <p>
 * private String name;
 * <p>
 * private String phone_booking;
 * <p>
 * private String email;
 * <p>
 * public void setWebsite(String website){
 * this.website = website;
 * }
 * public String getWebsite(){
 * return this.website;
 * }
 * public void setShortdescr(String shortdescr){
 * this.shortdescr = shortdescr;
 * }
 * public String getShortdescr(){
 * return this.shortdescr;
 * }
 * public void setPerformers(String performers){
 * this.performers = performers;
 * }
 * public String getPerformers(){
 * return this.performers;
 * }
 * public void setPhone_contact(String phone_contact){
 * this.phone_contact = phone_contact;
 * }
 * public String getPhone_contact(){
 * return this.phone_contact;
 * }
 * public void setAgenda_url(String agenda_url){
 * this.agenda_url = agenda_url;
 * }
 * public String getAgenda_url(){
 * return this.agenda_url;
 * }
 * public void setBoxoffice_url(String boxoffice_url){
 * this.boxoffice_url = boxoffice_url;
 * }
 * public String getBoxoffice_url(){
 * return this.boxoffice_url;
 * }
 * public void setLongdescr(String longdescr){
 * this.longdescr = longdescr;
 * }
 * public String getLongdescr(){
 * return this.longdescr;
 * }
 * public void setName(String name){
 * this.name = name;
 * }
 * public String getName(){
 * return this.name;
 * }
 * public void setPhone_booking(String phone_booking){
 * this.phone_booking = phone_booking;
 * }
 * public String getPhone_booking(){
 * return this.phone_booking;
 * }
 * public void setEmail(String email){
 * this.email = email;
 * }
 * public String getEmail(){
 * return this.email;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Cn
 * {
 * private String website;
 * <p>
 * private String shortdescr;
 * <p>
 * private String performers;
 * <p>
 * private String phone_contact;
 * <p>
 * private String agenda_url;
 * <p>
 * private String boxoffice_url;
 * <p>
 * private String longdescr;
 * <p>
 * private String name;
 * <p>
 * private String phone_booking;
 * <p>
 * private String email;
 * <p>
 * public void setWebsite(String website){
 * this.website = website;
 * }
 * public String getWebsite(){
 * return this.website;
 * }
 * public void setShortdescr(String shortdescr){
 * this.shortdescr = shortdescr;
 * }
 * public String getShortdescr(){
 * return this.shortdescr;
 * }
 * public void setPerformers(String performers){
 * this.performers = performers;
 * }
 * public String getPerformers(){
 * return this.performers;
 * }
 * public void setPhone_contact(String phone_contact){
 * this.phone_contact = phone_contact;
 * }
 * public String getPhone_contact(){
 * return this.phone_contact;
 * }
 * public void setAgenda_url(String agenda_url){
 * this.agenda_url = agenda_url;
 * }
 * public String getAgenda_url(){
 * return this.agenda_url;
 * }
 * public void setBoxoffice_url(String boxoffice_url){
 * this.boxoffice_url = boxoffice_url;
 * }
 * public String getBoxoffice_url(){
 * return this.boxoffice_url;
 * }
 * public void setLongdescr(String longdescr){
 * this.longdescr = longdescr;
 * }
 * public String getLongdescr(){
 * return this.longdescr;
 * }
 * public void setName(String name){
 * this.name = name;
 * }
 * public String getName(){
 * return this.name;
 * }
 * public void setPhone_booking(String phone_booking){
 * this.phone_booking = phone_booking;
 * }
 * public String getPhone_booking(){
 * return this.phone_booking;
 * }
 * public void setEmail(String email){
 * this.email = email;
 * }
 * public String getEmail(){
 * return this.email;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Fr
 * {
 * private String website;
 * <p>
 * private String shortdescr;
 * <p>
 * private String performers;
 * <p>
 * private String phone_contact;
 * <p>
 * private String agenda_url;
 * <p>
 * private String boxoffice_url;
 * <p>
 * private String longdescr;
 * <p>
 * private String name;
 * <p>
 * private String phone_booking;
 * <p>
 * private String email;
 * <p>
 * public void setWebsite(String website){
 * this.website = website;
 * }
 * public String getWebsite(){
 * return this.website;
 * }
 * public void setShortdescr(String shortdescr){
 * this.shortdescr = shortdescr;
 * }
 * public String getShortdescr(){
 * return this.shortdescr;
 * }
 * public void setPerformers(String performers){
 * this.performers = performers;
 * }
 * public String getPerformers(){
 * return this.performers;
 * }
 * public void setPhone_contact(String phone_contact){
 * this.phone_contact = phone_contact;
 * }
 * public String getPhone_contact(){
 * return this.phone_contact;
 * }
 * public void setAgenda_url(String agenda_url){
 * this.agenda_url = agenda_url;
 * }
 * public String getAgenda_url(){
 * return this.agenda_url;
 * }
 * public void setBoxoffice_url(String boxoffice_url){
 * this.boxoffice_url = boxoffice_url;
 * }
 * public String getBoxoffice_url(){
 * return this.boxoffice_url;
 * }
 * public void setLongdescr(String longdescr){
 * this.longdescr = longdescr;
 * }
 * public String getLongdescr(){
 * return this.longdescr;
 * }
 * public void setName(String name){
 * this.name = name;
 * }
 * public String getName(){
 * return this.name;
 * }
 * public void setPhone_booking(String phone_booking){
 * this.phone_booking = phone_booking;
 * }
 * public String getPhone_booking(){
 * return this.phone_booking;
 * }
 * public void setEmail(String email){
 * this.email = email;
 * }
 * public String getEmail(){
 * return this.email;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Sp
 * {
 * private String website;
 * <p>
 * private String shortdescr;
 * <p>
 * private String performers;
 * <p>
 * private String phone_contact;
 * <p>
 * private String agenda_url;
 * <p>
 * private String boxoffice_url;
 * <p>
 * private String longdescr;
 * <p>
 * private String name;
 * <p>
 * private String phone_booking;
 * <p>
 * private String email;
 * <p>
 * public void setWebsite(String website){
 * this.website = website;
 * }
 * public String getWebsite(){
 * return this.website;
 * }
 * public void setShortdescr(String shortdescr){
 * this.shortdescr = shortdescr;
 * }
 * public String getShortdescr(){
 * return this.shortdescr;
 * }
 * public void setPerformers(String performers){
 * this.performers = performers;
 * }
 * public String getPerformers(){
 * return this.performers;
 * }
 * public void setPhone_contact(String phone_contact){
 * this.phone_contact = phone_contact;
 * }
 * public String getPhone_contact(){
 * return this.phone_contact;
 * }
 * public void setAgenda_url(String agenda_url){
 * this.agenda_url = agenda_url;
 * }
 * public String getAgenda_url(){
 * return this.agenda_url;
 * }
 * public void setBoxoffice_url(String boxoffice_url){
 * this.boxoffice_url = boxoffice_url;
 * }
 * public String getBoxoffice_url(){
 * return this.boxoffice_url;
 * }
 * public void setLongdescr(String longdescr){
 * this.longdescr = longdescr;
 * }
 * public String getLongdescr(){
 * return this.longdescr;
 * }
 * public void setName(String name){
 * this.name = name;
 * }
 * public String getName(){
 * return this.name;
 * }
 * public void setPhone_booking(String phone_booking){
 * this.phone_booking = phone_booking;
 * }
 * public String getPhone_booking(){
 * return this.phone_booking;
 * }
 * public void setEmail(String email){
 * this.email = email;
 * }
 * public String getEmail(){
 * return this.email;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Nl
 * {
 * private String website;
 * <p>
 * private String shortdescr;
 * <p>
 * private String performers;
 * <p>
 * private String phone_contact;
 * <p>
 * private String agenda_url;
 * <p>
 * private String boxoffice_url;
 * <p>
 * private String longdescr;
 * <p>
 * private String name;
 * <p>
 * private String phone_booking;
 * <p>
 * private String email;
 * <p>
 * public void setWebsite(String website){
 * this.website = website;
 * }
 * public String getWebsite(){
 * return this.website;
 * }
 * public void setShortdescr(String shortdescr){
 * this.shortdescr = shortdescr;
 * }
 * public String getShortdescr(){
 * return this.shortdescr;
 * }
 * public void setPerformers(String performers){
 * this.performers = performers;
 * }
 * public String getPerformers(){
 * return this.performers;
 * }
 * public void setPhone_contact(String phone_contact){
 * this.phone_contact = phone_contact;
 * }
 * public String getPhone_contact(){
 * return this.phone_contact;
 * }
 * public void setAgenda_url(String agenda_url){
 * this.agenda_url = agenda_url;
 * }
 * public String getAgenda_url(){
 * return this.agenda_url;
 * }
 * public void setBoxoffice_url(String boxoffice_url){
 * this.boxoffice_url = boxoffice_url;
 * }
 * public String getBoxoffice_url(){
 * return this.boxoffice_url;
 * }
 * public void setLongdescr(String longdescr){
 * this.longdescr = longdescr;
 * }
 * public String getLongdescr(){
 * return this.longdescr;
 * }
 * public void setName(String name){
 * this.name = name;
 * }
 * public String getName(){
 * return this.name;
 * }
 * public void setPhone_booking(String phone_booking){
 * this.phone_booking = phone_booking;
 * }
 * public String getPhone_booking(){
 * return this.phone_booking;
 * }
 * public void setEmail(String email){
 * this.email = email;
 * }
 * public String getEmail(){
 * return this.email;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Translations
 * {
 * private De de;
 * <p>
 * private Pt pt;
 * <p>
 * private En en;
 * <p>
 * private It it;
 * <p>
 * private Cn cn;
 * <p>
 * private Fr fr;
 * <p>
 * private Sp sp;
 * <p>
 * private Nl nl;
 * <p>
 * public void setDe(De de){
 * this.de = de;
 * }
 * public De getDe(){
 * return this.de;
 * }
 * public void setPt(Pt pt){
 * this.pt = pt;
 * }
 * public Pt getPt(){
 * return this.pt;
 * }
 * public void setEn(En en){
 * this.en = en;
 * }
 * public En getEn(){
 * return this.en;
 * }
 * public void setIt(It it){
 * this.it = it;
 * }
 * public It getIt(){
 * return this.it;
 * }
 * public void setCn(Cn cn){
 * this.cn = cn;
 * }
 * public Cn getCn(){
 * return this.cn;
 * }
 * public void setFr(Fr fr){
 * this.fr = fr;
 * }
 * public Fr getFr(){
 * return this.fr;
 * }
 * public void setSp(Sp sp){
 * this.sp = sp;
 * }
 * public Sp getSp(){
 * return this.sp;
 * }
 * public void setNl(Nl nl){
 * this.nl = nl;
 * }
 * public Nl getNl(){
 * return this.nl;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Translations
 * {
 * private String en;
 * <p>
 * private String fr;
 * <p>
 * private String nl;
 * <p>
 * public void setEn(String en){
 * this.en = en;
 * }
 * public String getEn(){
 * return this.en;
 * }
 * public void setFr(String fr){
 * this.fr = fr;
 * }
 * public String getFr(){
 * return this.fr;
 * }
 * public void setNl(String nl){
 * this.nl = nl;
 * }
 * public String getNl(){
 * return this.nl;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Main
 * {
 * private Translations translations;
 * <p>
 * private int id;
 * <p>
 * public void setTranslations(Translations translations){
 * this.translations = translations;
 * }
 * public Translations getTranslations(){
 * return this.translations;
 * }
 * public void setId(int id){
 * this.id = id;
 * }
 * public int getId(){
 * return this.id;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * import java.util.ArrayList;
 * import java.util.List;
 * public class Translations
 * {
 * private List<String> en;
 * <p>
 * private List<String> fr;
 * <p>
 * private List<String> nl;
 * <p>
 * public void setEn(List<String> en){
 * this.en = en;
 * }
 * public List<String> getEn(){
 * return this.en;
 * }
 * public void setFr(List<String> fr){
 * this.fr = fr;
 * }
 * public List<String> getFr(){
 * return this.fr;
 * }
 * public void setNl(List<String> nl){
 * this.nl = nl;
 * }
 * public List<String> getNl(){
 * return this.nl;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * import java.util.ArrayList;
 * import java.util.List;
 * public class Others
 * {
 * private Translations translations;
 * <p>
 * private List<int> list;
 * <p>
 * public void setTranslations(Translations translations){
 * this.translations = translations;
 * }
 * public Translations getTranslations(){
 * return this.translations;
 * }
 * public void setList(List<int> list){
 * this.list = list;
 * }
 * public List<int> getList(){
 * return this.list;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Categories
 * {
 * private Main main;
 * <p>
 * private Others others;
 * <p>
 * public void setMain(Main main){
 * this.main = main;
 * }
 * public Main getMain(){
 * return this.main;
 * }
 * public void setOthers(Others others){
 * this.others = others;
 * }
 * public Others getOthers(){
 * return this.others;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Translations
 * {
 * private String fr;
 * <p>
 * private String nl;
 * <p>
 * public void setFr(String fr){
 * this.fr = fr;
 * }
 * public String getFr(){
 * return this.fr;
 * }
 * public void setNl(String nl){
 * this.nl = nl;
 * }
 * public String getNl(){
 * return this.nl;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Districts
 * {
 * private Translations translations;
 * <p>
 * private int list;
 * <p>
 * public void setTranslations(Translations translations){
 * this.translations = translations;
 * }
 * public Translations getTranslations(){
 * return this.translations;
 * }
 * public void setList(int list){
 * this.list = list;
 * }
 * public int getList(){
 * return this.list;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class De
 * {
 * private int address_street_number;
 * <p>
 * private String website;
 * <p>
 * private String address_street_name;
 * <p>
 * private String booking_url;
 * <p>
 * private String address_street_box;
 * <p>
 * private String phone_booking;
 * <p>
 * private String address_city;
 * <p>
 * private String description_print;
 * <p>
 * private String phone_contact;
 * <p>
 * private String address_line2;
 * <p>
 * private String address_line1;
 * <p>
 * private String name;
 * <p>
 * private String description_web;
 * <p>
 * private int address_zip;
 * <p>
 * private String sort_order;
 * <p>
 * private String email;
 * <p>
 * public void setAddress_street_number(int address_street_number){
 * this.address_street_number = address_street_number;
 * }
 * public int getAddress_street_number(){
 * return this.address_street_number;
 * }
 * public void setWebsite(String website){
 * this.website = website;
 * }
 * public String getWebsite(){
 * return this.website;
 * }
 * public void setAddress_street_name(String address_street_name){
 * this.address_street_name = address_street_name;
 * }
 * public String getAddress_street_name(){
 * return this.address_street_name;
 * }
 * public void setBooking_url(String booking_url){
 * this.booking_url = booking_url;
 * }
 * public String getBooking_url(){
 * return this.booking_url;
 * }
 * public void setAddress_street_box(String address_street_box){
 * this.address_street_box = address_street_box;
 * }
 * public String getAddress_street_box(){
 * return this.address_street_box;
 * }
 * public void setPhone_booking(String phone_booking){
 * this.phone_booking = phone_booking;
 * }
 * public String getPhone_booking(){
 * return this.phone_booking;
 * }
 * public void setAddress_city(String address_city){
 * this.address_city = address_city;
 * }
 * public String getAddress_city(){
 * return this.address_city;
 * }
 * public void setDescription_print(String description_print){
 * this.description_print = description_print;
 * }
 * public String getDescription_print(){
 * return this.description_print;
 * }
 * public void setPhone_contact(String phone_contact){
 * this.phone_contact = phone_contact;
 * }
 * public String getPhone_contact(){
 * return this.phone_contact;
 * }
 * public void setAddress_line2(String address_line2){
 * this.address_line2 = address_line2;
 * }
 * public String getAddress_line2(){
 * return this.address_line2;
 * }
 * public void setAddress_line1(String address_line1){
 * this.address_line1 = address_line1;
 * }
 * public String getAddress_line1(){
 * return this.address_line1;
 * }
 * public void setName(String name){
 * this.name = name;
 * }
 * public String getName(){
 * return this.name;
 * }
 * public void setDescription_web(String description_web){
 * this.description_web = description_web;
 * }
 * public String getDescription_web(){
 * return this.description_web;
 * }
 * public void setAddress_zip(int address_zip){
 * this.address_zip = address_zip;
 * }
 * public int getAddress_zip(){
 * return this.address_zip;
 * }
 * public void setSort_order(String sort_order){
 * this.sort_order = sort_order;
 * }
 * public String getSort_order(){
 * return this.sort_order;
 * }
 * public void setEmail(String email){
 * this.email = email;
 * }
 * public String getEmail(){
 * return this.email;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Pt
 * {
 * private int address_street_number;
 * <p>
 * private String website;
 * <p>
 * private String address_street_name;
 * <p>
 * private String booking_url;
 * <p>
 * private String address_street_box;
 * <p>
 * private String phone_booking;
 * <p>
 * private String address_city;
 * <p>
 * private String description_print;
 * <p>
 * private String phone_contact;
 * <p>
 * private String address_line2;
 * <p>
 * private String address_line1;
 * <p>
 * private String name;
 * <p>
 * private String description_web;
 * <p>
 * private int address_zip;
 * <p>
 * private String sort_order;
 * <p>
 * private String email;
 * <p>
 * public void setAddress_street_number(int address_street_number){
 * this.address_street_number = address_street_number;
 * }
 * public int getAddress_street_number(){
 * return this.address_street_number;
 * }
 * public void setWebsite(String website){
 * this.website = website;
 * }
 * public String getWebsite(){
 * return this.website;
 * }
 * public void setAddress_street_name(String address_street_name){
 * this.address_street_name = address_street_name;
 * }
 * public String getAddress_street_name(){
 * return this.address_street_name;
 * }
 * public void setBooking_url(String booking_url){
 * this.booking_url = booking_url;
 * }
 * public String getBooking_url(){
 * return this.booking_url;
 * }
 * public void setAddress_street_box(String address_street_box){
 * this.address_street_box = address_street_box;
 * }
 * public String getAddress_street_box(){
 * return this.address_street_box;
 * }
 * public void setPhone_booking(String phone_booking){
 * this.phone_booking = phone_booking;
 * }
 * public String getPhone_booking(){
 * return this.phone_booking;
 * }
 * public void setAddress_city(String address_city){
 * this.address_city = address_city;
 * }
 * public String getAddress_city(){
 * return this.address_city;
 * }
 * public void setDescription_print(String description_print){
 * this.description_print = description_print;
 * }
 * public String getDescription_print(){
 * return this.description_print;
 * }
 * public void setPhone_contact(String phone_contact){
 * this.phone_contact = phone_contact;
 * }
 * public String getPhone_contact(){
 * return this.phone_contact;
 * }
 * public void setAddress_line2(String address_line2){
 * this.address_line2 = address_line2;
 * }
 * public String getAddress_line2(){
 * return this.address_line2;
 * }
 * public void setAddress_line1(String address_line1){
 * this.address_line1 = address_line1;
 * }
 * public String getAddress_line1(){
 * return this.address_line1;
 * }
 * public void setName(String name){
 * this.name = name;
 * }
 * public String getName(){
 * return this.name;
 * }
 * public void setDescription_web(String description_web){
 * this.description_web = description_web;
 * }
 * public String getDescription_web(){
 * return this.description_web;
 * }
 * public void setAddress_zip(int address_zip){
 * this.address_zip = address_zip;
 * }
 * public int getAddress_zip(){
 * return this.address_zip;
 * }
 * public void setSort_order(String sort_order){
 * this.sort_order = sort_order;
 * }
 * public String getSort_order(){
 * return this.sort_order;
 * }
 * public void setEmail(String email){
 * this.email = email;
 * }
 * public String getEmail(){
 * return this.email;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class En
 * {
 * private int address_street_number;
 * <p>
 * private String website;
 * <p>
 * private String address_street_name;
 * <p>
 * private String booking_url;
 * <p>
 * private String address_street_box;
 * <p>
 * private String phone_booking;
 * <p>
 * private String address_city;
 * <p>
 * private String description_print;
 * <p>
 * private String phone_contact;
 * <p>
 * private String address_line2;
 * <p>
 * private String address_line1;
 * <p>
 * private String name;
 * <p>
 * private String description_web;
 * <p>
 * private int address_zip;
 * <p>
 * private String sort_order;
 * <p>
 * private String email;
 * <p>
 * public void setAddress_street_number(int address_street_number){
 * this.address_street_number = address_street_number;
 * }
 * public int getAddress_street_number(){
 * return this.address_street_number;
 * }
 * public void setWebsite(String website){
 * this.website = website;
 * }
 * public String getWebsite(){
 * return this.website;
 * }
 * public void setAddress_street_name(String address_street_name){
 * this.address_street_name = address_street_name;
 * }
 * public String getAddress_street_name(){
 * return this.address_street_name;
 * }
 * public void setBooking_url(String booking_url){
 * this.booking_url = booking_url;
 * }
 * public String getBooking_url(){
 * return this.booking_url;
 * }
 * public void setAddress_street_box(String address_street_box){
 * this.address_street_box = address_street_box;
 * }
 * public String getAddress_street_box(){
 * return this.address_street_box;
 * }
 * public void setPhone_booking(String phone_booking){
 * this.phone_booking = phone_booking;
 * }
 * public String getPhone_booking(){
 * return this.phone_booking;
 * }
 * public void setAddress_city(String address_city){
 * this.address_city = address_city;
 * }
 * public String getAddress_city(){
 * return this.address_city;
 * }
 * public void setDescription_print(String description_print){
 * this.description_print = description_print;
 * }
 * public String getDescription_print(){
 * return this.description_print;
 * }
 * public void setPhone_contact(String phone_contact){
 * this.phone_contact = phone_contact;
 * }
 * public String getPhone_contact(){
 * return this.phone_contact;
 * }
 * public void setAddress_line2(String address_line2){
 * this.address_line2 = address_line2;
 * }
 * public String getAddress_line2(){
 * return this.address_line2;
 * }
 * public void setAddress_line1(String address_line1){
 * this.address_line1 = address_line1;
 * }
 * public String getAddress_line1(){
 * return this.address_line1;
 * }
 * public void setName(String name){
 * this.name = name;
 * }
 * public String getName(){
 * return this.name;
 * }
 * public void setDescription_web(String description_web){
 * this.description_web = description_web;
 * }
 * public String getDescription_web(){
 * return this.description_web;
 * }
 * public void setAddress_zip(int address_zip){
 * this.address_zip = address_zip;
 * }
 * public int getAddress_zip(){
 * return this.address_zip;
 * }
 * public void setSort_order(String sort_order){
 * this.sort_order = sort_order;
 * }
 * public String getSort_order(){
 * return this.sort_order;
 * }
 * public void setEmail(String email){
 * this.email = email;
 * }
 * public String getEmail(){
 * return this.email;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class It
 * {
 * private int address_street_number;
 * <p>
 * private String website;
 * <p>
 * private String address_street_name;
 * <p>
 * private String booking_url;
 * <p>
 * private String address_street_box;
 * <p>
 * private String phone_booking;
 * <p>
 * private String address_city;
 * <p>
 * private String description_print;
 * <p>
 * private String phone_contact;
 * <p>
 * private String address_line2;
 * <p>
 * private String address_line1;
 * <p>
 * private String name;
 * <p>
 * private String description_web;
 * <p>
 * private int address_zip;
 * <p>
 * private String sort_order;
 * <p>
 * private String email;
 * <p>
 * public void setAddress_street_number(int address_street_number){
 * this.address_street_number = address_street_number;
 * }
 * public int getAddress_street_number(){
 * return this.address_street_number;
 * }
 * public void setWebsite(String website){
 * this.website = website;
 * }
 * public String getWebsite(){
 * return this.website;
 * }
 * public void setAddress_street_name(String address_street_name){
 * this.address_street_name = address_street_name;
 * }
 * public String getAddress_street_name(){
 * return this.address_street_name;
 * }
 * public void setBooking_url(String booking_url){
 * this.booking_url = booking_url;
 * }
 * public String getBooking_url(){
 * return this.booking_url;
 * }
 * public void setAddress_street_box(String address_street_box){
 * this.address_street_box = address_street_box;
 * }
 * public String getAddress_street_box(){
 * return this.address_street_box;
 * }
 * public void setPhone_booking(String phone_booking){
 * this.phone_booking = phone_booking;
 * }
 * public String getPhone_booking(){
 * return this.phone_booking;
 * }
 * public void setAddress_city(String address_city){
 * this.address_city = address_city;
 * }
 * public String getAddress_city(){
 * return this.address_city;
 * }
 * public void setDescription_print(String description_print){
 * this.description_print = description_print;
 * }
 * public String getDescription_print(){
 * return this.description_print;
 * }
 * public void setPhone_contact(String phone_contact){
 * this.phone_contact = phone_contact;
 * }
 * public String getPhone_contact(){
 * return this.phone_contact;
 * }
 * public void setAddress_line2(String address_line2){
 * this.address_line2 = address_line2;
 * }
 * public String getAddress_line2(){
 * return this.address_line2;
 * }
 * public void setAddress_line1(String address_line1){
 * this.address_line1 = address_line1;
 * }
 * public String getAddress_line1(){
 * return this.address_line1;
 * }
 * public void setName(String name){
 * this.name = name;
 * }
 * public String getName(){
 * return this.name;
 * }
 * public void setDescription_web(String description_web){
 * this.description_web = description_web;
 * }
 * public String getDescription_web(){
 * return this.description_web;
 * }
 * public void setAddress_zip(int address_zip){
 * this.address_zip = address_zip;
 * }
 * public int getAddress_zip(){
 * return this.address_zip;
 * }
 * public void setSort_order(String sort_order){
 * this.sort_order = sort_order;
 * }
 * public String getSort_order(){
 * return this.sort_order;
 * }
 * public void setEmail(String email){
 * this.email = email;
 * }
 * public String getEmail(){
 * return this.email;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Cn
 * {
 * private int address_street_number;
 * <p>
 * private String website;
 * <p>
 * private String address_street_name;
 * <p>
 * private String booking_url;
 * <p>
 * private String address_street_box;
 * <p>
 * private String phone_booking;
 * <p>
 * private String address_city;
 * <p>
 * private String description_print;
 * <p>
 * private String phone_contact;
 * <p>
 * private String address_line2;
 * <p>
 * private String address_line1;
 * <p>
 * private String name;
 * <p>
 * private String description_web;
 * <p>
 * private int address_zip;
 * <p>
 * private String sort_order;
 * <p>
 * private String email;
 * <p>
 * public void setAddress_street_number(int address_street_number){
 * this.address_street_number = address_street_number;
 * }
 * public int getAddress_street_number(){
 * return this.address_street_number;
 * }
 * public void setWebsite(String website){
 * this.website = website;
 * }
 * public String getWebsite(){
 * return this.website;
 * }
 * public void setAddress_street_name(String address_street_name){
 * this.address_street_name = address_street_name;
 * }
 * public String getAddress_street_name(){
 * return this.address_street_name;
 * }
 * public void setBooking_url(String booking_url){
 * this.booking_url = booking_url;
 * }
 * public String getBooking_url(){
 * return this.booking_url;
 * }
 * public void setAddress_street_box(String address_street_box){
 * this.address_street_box = address_street_box;
 * }
 * public String getAddress_street_box(){
 * return this.address_street_box;
 * }
 * public void setPhone_booking(String phone_booking){
 * this.phone_booking = phone_booking;
 * }
 * public String getPhone_booking(){
 * return this.phone_booking;
 * }
 * public void setAddress_city(String address_city){
 * this.address_city = address_city;
 * }
 * public String getAddress_city(){
 * return this.address_city;
 * }
 * public void setDescription_print(String description_print){
 * this.description_print = description_print;
 * }
 * public String getDescription_print(){
 * return this.description_print;
 * }
 * public void setPhone_contact(String phone_contact){
 * this.phone_contact = phone_contact;
 * }
 * public String getPhone_contact(){
 * return this.phone_contact;
 * }
 * public void setAddress_line2(String address_line2){
 * this.address_line2 = address_line2;
 * }
 * public String getAddress_line2(){
 * return this.address_line2;
 * }
 * public void setAddress_line1(String address_line1){
 * this.address_line1 = address_line1;
 * }
 * public String getAddress_line1(){
 * return this.address_line1;
 * }
 * public void setName(String name){
 * this.name = name;
 * }
 * public String getName(){
 * return this.name;
 * }
 * public void setDescription_web(String description_web){
 * this.description_web = description_web;
 * }
 * public String getDescription_web(){
 * return this.description_web;
 * }
 * public void setAddress_zip(int address_zip){
 * this.address_zip = address_zip;
 * }
 * public int getAddress_zip(){
 * return this.address_zip;
 * }
 * public void setSort_order(String sort_order){
 * this.sort_order = sort_order;
 * }
 * public String getSort_order(){
 * return this.sort_order;
 * }
 * public void setEmail(String email){
 * this.email = email;
 * }
 * public String getEmail(){
 * return this.email;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Fr
 * {
 * private int address_street_number;
 * <p>
 * private String website;
 * <p>
 * private String address_street_name;
 * <p>
 * private String booking_url;
 * <p>
 * private String address_street_box;
 * <p>
 * private String phone_booking;
 * <p>
 * private String address_city;
 * <p>
 * private String description_print;
 * <p>
 * private String phone_contact;
 * <p>
 * private String address_line2;
 * <p>
 * private String address_line1;
 * <p>
 * private String name;
 * <p>
 * private String description_web;
 * <p>
 * private int address_zip;
 * <p>
 * private String sort_order;
 * <p>
 * private String email;
 * <p>
 * public void setAddress_street_number(int address_street_number){
 * this.address_street_number = address_street_number;
 * }
 * public int getAddress_street_number(){
 * return this.address_street_number;
 * }
 * public void setWebsite(String website){
 * this.website = website;
 * }
 * public String getWebsite(){
 * return this.website;
 * }
 * public void setAddress_street_name(String address_street_name){
 * this.address_street_name = address_street_name;
 * }
 * public String getAddress_street_name(){
 * return this.address_street_name;
 * }
 * public void setBooking_url(String booking_url){
 * this.booking_url = booking_url;
 * }
 * public String getBooking_url(){
 * return this.booking_url;
 * }
 * public void setAddress_street_box(String address_street_box){
 * this.address_street_box = address_street_box;
 * }
 * public String getAddress_street_box(){
 * return this.address_street_box;
 * }
 * public void setPhone_booking(String phone_booking){
 * this.phone_booking = phone_booking;
 * }
 * public String getPhone_booking(){
 * return this.phone_booking;
 * }
 * public void setAddress_city(String address_city){
 * this.address_city = address_city;
 * }
 * public String getAddress_city(){
 * return this.address_city;
 * }
 * public void setDescription_print(String description_print){
 * this.description_print = description_print;
 * }
 * public String getDescription_print(){
 * return this.description_print;
 * }
 * public void setPhone_contact(String phone_contact){
 * this.phone_contact = phone_contact;
 * }
 * public String getPhone_contact(){
 * return this.phone_contact;
 * }
 * public void setAddress_line2(String address_line2){
 * this.address_line2 = address_line2;
 * }
 * public String getAddress_line2(){
 * return this.address_line2;
 * }
 * public void setAddress_line1(String address_line1){
 * this.address_line1 = address_line1;
 * }
 * public String getAddress_line1(){
 * return this.address_line1;
 * }
 * public void setName(String name){
 * this.name = name;
 * }
 * public String getName(){
 * return this.name;
 * }
 * public void setDescription_web(String description_web){
 * this.description_web = description_web;
 * }
 * public String getDescription_web(){
 * return this.description_web;
 * }
 * public void setAddress_zip(int address_zip){
 * this.address_zip = address_zip;
 * }
 * public int getAddress_zip(){
 * return this.address_zip;
 * }
 * public void setSort_order(String sort_order){
 * this.sort_order = sort_order;
 * }
 * public String getSort_order(){
 * return this.sort_order;
 * }
 * public void setEmail(String email){
 * this.email = email;
 * }
 * public String getEmail(){
 * return this.email;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Sp
 * {
 * private int address_street_number;
 * <p>
 * private String website;
 * <p>
 * private String address_street_name;
 * <p>
 * private String booking_url;
 * <p>
 * private String address_street_box;
 * <p>
 * private String phone_booking;
 * <p>
 * private String address_city;
 * <p>
 * private String description_print;
 * <p>
 * private String phone_contact;
 * <p>
 * private String address_line2;
 * <p>
 * private String address_line1;
 * <p>
 * private String name;
 * <p>
 * private String description_web;
 * <p>
 * private int address_zip;
 * <p>
 * private String sort_order;
 * <p>
 * private String email;
 * <p>
 * public void setAddress_street_number(int address_street_number){
 * this.address_street_number = address_street_number;
 * }
 * public int getAddress_street_number(){
 * return this.address_street_number;
 * }
 * public void setWebsite(String website){
 * this.website = website;
 * }
 * public String getWebsite(){
 * return this.website;
 * }
 * public void setAddress_street_name(String address_street_name){
 * this.address_street_name = address_street_name;
 * }
 * public String getAddress_street_name(){
 * return this.address_street_name;
 * }
 * public void setBooking_url(String booking_url){
 * this.booking_url = booking_url;
 * }
 * public String getBooking_url(){
 * return this.booking_url;
 * }
 * public void setAddress_street_box(String address_street_box){
 * this.address_street_box = address_street_box;
 * }
 * public String getAddress_street_box(){
 * return this.address_street_box;
 * }
 * public void setPhone_booking(String phone_booking){
 * this.phone_booking = phone_booking;
 * }
 * public String getPhone_booking(){
 * return this.phone_booking;
 * }
 * public void setAddress_city(String address_city){
 * this.address_city = address_city;
 * }
 * public String getAddress_city(){
 * return this.address_city;
 * }
 * public void setDescription_print(String description_print){
 * this.description_print = description_print;
 * }
 * public String getDescription_print(){
 * return this.description_print;
 * }
 * public void setPhone_contact(String phone_contact){
 * this.phone_contact = phone_contact;
 * }
 * public String getPhone_contact(){
 * return this.phone_contact;
 * }
 * public void setAddress_line2(String address_line2){
 * this.address_line2 = address_line2;
 * }
 * public String getAddress_line2(){
 * return this.address_line2;
 * }
 * public void setAddress_line1(String address_line1){
 * this.address_line1 = address_line1;
 * }
 * public String getAddress_line1(){
 * return this.address_line1;
 * }
 * public void setName(String name){
 * this.name = name;
 * }
 * public String getName(){
 * return this.name;
 * }
 * public void setDescription_web(String description_web){
 * this.description_web = description_web;
 * }
 * public String getDescription_web(){
 * return this.description_web;
 * }
 * public void setAddress_zip(int address_zip){
 * this.address_zip = address_zip;
 * }
 * public int getAddress_zip(){
 * return this.address_zip;
 * }
 * public void setSort_order(String sort_order){
 * this.sort_order = sort_order;
 * }
 * public String getSort_order(){
 * return this.sort_order;
 * }
 * public void setEmail(String email){
 * this.email = email;
 * }
 * public String getEmail(){
 * return this.email;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Nl
 * {
 * private int address_street_number;
 * <p>
 * private String website;
 * <p>
 * private String address_street_name;
 * <p>
 * private String booking_url;
 * <p>
 * private String address_street_box;
 * <p>
 * private String phone_booking;
 * <p>
 * private String address_city;
 * <p>
 * private String description_print;
 * <p>
 * private String phone_contact;
 * <p>
 * private String address_line2;
 * <p>
 * private String address_line1;
 * <p>
 * private String name;
 * <p>
 * private String description_web;
 * <p>
 * private int address_zip;
 * <p>
 * private String sort_order;
 * <p>
 * private String email;
 * <p>
 * public void setAddress_street_number(int address_street_number){
 * this.address_street_number = address_street_number;
 * }
 * public int getAddress_street_number(){
 * return this.address_street_number;
 * }
 * public void setWebsite(String website){
 * this.website = website;
 * }
 * public String getWebsite(){
 * return this.website;
 * }
 * public void setAddress_street_name(String address_street_name){
 * this.address_street_name = address_street_name;
 * }
 * public String getAddress_street_name(){
 * return this.address_street_name;
 * }
 * public void setBooking_url(String booking_url){
 * this.booking_url = booking_url;
 * }
 * public String getBooking_url(){
 * return this.booking_url;
 * }
 * public void setAddress_street_box(String address_street_box){
 * this.address_street_box = address_street_box;
 * }
 * public String getAddress_street_box(){
 * return this.address_street_box;
 * }
 * public void setPhone_booking(String phone_booking){
 * this.phone_booking = phone_booking;
 * }
 * public String getPhone_booking(){
 * return this.phone_booking;
 * }
 * public void setAddress_city(String address_city){
 * this.address_city = address_city;
 * }
 * public String getAddress_city(){
 * return this.address_city;
 * }
 * public void setDescription_print(String description_print){
 * this.description_print = description_print;
 * }
 * public String getDescription_print(){
 * return this.description_print;
 * }
 * public void setPhone_contact(String phone_contact){
 * this.phone_contact = phone_contact;
 * }
 * public String getPhone_contact(){
 * return this.phone_contact;
 * }
 * public void setAddress_line2(String address_line2){
 * this.address_line2 = address_line2;
 * }
 * public String getAddress_line2(){
 * return this.address_line2;
 * }
 * public void setAddress_line1(String address_line1){
 * this.address_line1 = address_line1;
 * }
 * public String getAddress_line1(){
 * return this.address_line1;
 * }
 * public void setName(String name){
 * this.name = name;
 * }
 * public String getName(){
 * return this.name;
 * }
 * public void setDescription_web(String description_web){
 * this.description_web = description_web;
 * }
 * public String getDescription_web(){
 * return this.description_web;
 * }
 * public void setAddress_zip(int address_zip){
 * this.address_zip = address_zip;
 * }
 * public int getAddress_zip(){
 * return this.address_zip;
 * }
 * public void setSort_order(String sort_order){
 * this.sort_order = sort_order;
 * }
 * public String getSort_order(){
 * return this.sort_order;
 * }
 * public void setEmail(String email){
 * this.email = email;
 * }
 * public String getEmail(){
 * return this.email;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Translations
 * {
 * private De de;
 * <p>
 * private Pt pt;
 * <p>
 * private En en;
 * <p>
 * private It it;
 * <p>
 * private Cn cn;
 * <p>
 * private Fr fr;
 * <p>
 * private Sp sp;
 * <p>
 * private Nl nl;
 * <p>
 * public void setDe(De de){
 * this.de = de;
 * }
 * public De getDe(){
 * return this.de;
 * }
 * public void setPt(Pt pt){
 * this.pt = pt;
 * }
 * public Pt getPt(){
 * return this.pt;
 * }
 * public void setEn(En en){
 * this.en = en;
 * }
 * public En getEn(){
 * return this.en;
 * }
 * public void setIt(It it){
 * this.it = it;
 * }
 * public It getIt(){
 * return this.it;
 * }
 * public void setCn(Cn cn){
 * this.cn = cn;
 * }
 * public Cn getCn(){
 * return this.cn;
 * }
 * public void setFr(Fr fr){
 * this.fr = fr;
 * }
 * public Fr getFr(){
 * return this.fr;
 * }
 * public void setSp(Sp sp){
 * this.sp = sp;
 * }
 * public Sp getSp(){
 * return this.sp;
 * }
 * public void setNl(Nl nl){
 * this.nl = nl;
 * }
 * public Nl getNl(){
 * return this.nl;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Location
 * {
 * private double lon;
 * <p>
 * private double lat;
 * <p>
 * public void setLon(double lon){
 * this.lon = lon;
 * }
 * public double getLon(){
 * return this.lon;
 * }
 * public void setLat(double lat){
 * this.lat = lat;
 * }
 * public double getLat(){
 * return this.lat;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Place
 * {
 * private String neca;
 * <p>
 * private Districts districts;
 * <p>
 * private String external_id;
 * <p>
 * private String facebook_id;
 * <p>
 * private boolean is_in_address_book;
 * <p>
 * private Translations translations;
 * <p>
 * private String last_updated_at;
 * <p>
 * private Location location;
 * <p>
 * private String import_origin;
 * <p>
 * private int id;
 * <p>
 * private boolean is_in_vb_export;
 * <p>
 * private String region;
 * <p>
 * private String published_at;
 * <p>
 * private int backoffice_id;
 * <p>
 * public void setNeca(String neca){
 * this.neca = neca;
 * }
 * public String getNeca(){
 * return this.neca;
 * }
 * public void setDistricts(Districts districts){
 * this.districts = districts;
 * }
 * public Districts getDistricts(){
 * return this.districts;
 * }
 * public void setExternal_id(String external_id){
 * this.external_id = external_id;
 * }
 * public String getExternal_id(){
 * return this.external_id;
 * }
 * public void setFacebook_id(String facebook_id){
 * this.facebook_id = facebook_id;
 * }
 * public String getFacebook_id(){
 * return this.facebook_id;
 * }
 * public void setIs_in_address_book(boolean is_in_address_book){
 * this.is_in_address_book = is_in_address_book;
 * }
 * public boolean getIs_in_address_book(){
 * return this.is_in_address_book;
 * }
 * public void setTranslations(Translations translations){
 * this.translations = translations;
 * }
 * public Translations getTranslations(){
 * return this.translations;
 * }
 * public void setLast_updated_at(String last_updated_at){
 * this.last_updated_at = last_updated_at;
 * }
 * public String getLast_updated_at(){
 * return this.last_updated_at;
 * }
 * public void setLocation(Location location){
 * this.location = location;
 * }
 * public Location getLocation(){
 * return this.location;
 * }
 * public void setImport_origin(String import_origin){
 * this.import_origin = import_origin;
 * }
 * public String getImport_origin(){
 * return this.import_origin;
 * }
 * public void setId(int id){
 * this.id = id;
 * }
 * public int getId(){
 * return this.id;
 * }
 * public void setIs_in_vb_export(boolean is_in_vb_export){
 * this.is_in_vb_export = is_in_vb_export;
 * }
 * public boolean getIs_in_vb_export(){
 * return this.is_in_vb_export;
 * }
 * public void setRegion(String region){
 * this.region = region;
 * }
 * public String getRegion(){
 * return this.region;
 * }
 * public void setPublished_at(String published_at){
 * this.published_at = published_at;
 * }
 * public String getPublished_at(){
 * return this.published_at;
 * }
 * public void setBackoffice_id(int backoffice_id){
 * this.backoffice_id = backoffice_id;
 * }
 * public int getBackoffice_id(){
 * return this.backoffice_id;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class En
 * {
 * private String name;
 * <p>
 * public void setName(String name){
 * this.name = name;
 * }
 * public String getName(){
 * return this.name;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Fr
 * {
 * private String name;
 * <p>
 * public void setName(String name){
 * this.name = name;
 * }
 * public String getName(){
 * return this.name;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Nl
 * {
 * private String name;
 * <p>
 * public void setName(String name){
 * this.name = name;
 * }
 * public String getName(){
 * return this.name;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Translations
 * {
 * private En en;
 * <p>
 * private Fr fr;
 * <p>
 * private Nl nl;
 * <p>
 * public void setEn(En en){
 * this.en = en;
 * }
 * public En getEn(){
 * return this.en;
 * }
 * public void setFr(Fr fr){
 * this.fr = fr;
 * }
 * public Fr getFr(){
 * return this.fr;
 * }
 * public void setNl(Nl nl){
 * this.nl = nl;
 * }
 * public Nl getNl(){
 * return this.nl;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Prices
 * {
 * private Translations translations;
 * <p>
 * private int value;
 * <p>
 * public void setTranslations(Translations translations){
 * this.translations = translations;
 * }
 * public Translations getTranslations(){
 * return this.translations;
 * }
 * public void setValue(int value){
 * this.value = value;
 * }
 * public int getValue(){
 * return this.value;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * import java.util.ArrayList;
 * import java.util.List;
 * public class Languages
 * {
 * private List<String> spoken;
 * <p>
 * public void setSpoken(List<String> spoken){
 * this.spoken = spoken;
 * }
 * public List<String> getSpoken(){
 * return this.spoken;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Dates
 * {
 * private String doors;
 * <p>
 * private String start;
 * <p>
 * private String end;
 * <p>
 * private DateTime day;
 * <p>
 * public void setDoors(String doors){
 * this.doors = doors;
 * }
 * public String getDoors(){
 * return this.doors;
 * }
 * public void setStart(String start){
 * this.start = start;
 * }
 * public String getStart(){
 * return this.start;
 * }
 * public void setEnd(String end){
 * this.end = end;
 * }
 * public String getEnd(){
 * return this.end;
 * }
 * public void setDay(DateTime day){
 * this.day = day;
 * }
 * public DateTime getDay(){
 * return this.day;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class De
 * {
 * private int address_street_number;
 * <p>
 * private String website;
 * <p>
 * private String address_street_name;
 * <p>
 * private String booking_url;
 * <p>
 * private String address_street_box;
 * <p>
 * private String phone_booking;
 * <p>
 * private String address_city;
 * <p>
 * private String description_print;
 * <p>
 * private String phone_contact;
 * <p>
 * private String address_line2;
 * <p>
 * private String address_line1;
 * <p>
 * private String name;
 * <p>
 * private String description_web;
 * <p>
 * private int address_zip;
 * <p>
 * private String sort_order;
 * <p>
 * private String email;
 * <p>
 * public void setAddress_street_number(int address_street_number){
 * this.address_street_number = address_street_number;
 * }
 * public int getAddress_street_number(){
 * return this.address_street_number;
 * }
 * public void setWebsite(String website){
 * this.website = website;
 * }
 * public String getWebsite(){
 * return this.website;
 * }
 * public void setAddress_street_name(String address_street_name){
 * this.address_street_name = address_street_name;
 * }
 * public String getAddress_street_name(){
 * return this.address_street_name;
 * }
 * public void setBooking_url(String booking_url){
 * this.booking_url = booking_url;
 * }
 * public String getBooking_url(){
 * return this.booking_url;
 * }
 * public void setAddress_street_box(String address_street_box){
 * this.address_street_box = address_street_box;
 * }
 * public String getAddress_street_box(){
 * return this.address_street_box;
 * }
 * public void setPhone_booking(String phone_booking){
 * this.phone_booking = phone_booking;
 * }
 * public String getPhone_booking(){
 * return this.phone_booking;
 * }
 * public void setAddress_city(String address_city){
 * this.address_city = address_city;
 * }
 * public String getAddress_city(){
 * return this.address_city;
 * }
 * public void setDescription_print(String description_print){
 * this.description_print = description_print;
 * }
 * public String getDescription_print(){
 * return this.description_print;
 * }
 * public void setPhone_contact(String phone_contact){
 * this.phone_contact = phone_contact;
 * }
 * public String getPhone_contact(){
 * return this.phone_contact;
 * }
 * public void setAddress_line2(String address_line2){
 * this.address_line2 = address_line2;
 * }
 * public String getAddress_line2(){
 * return this.address_line2;
 * }
 * public void setAddress_line1(String address_line1){
 * this.address_line1 = address_line1;
 * }
 * public String getAddress_line1(){
 * return this.address_line1;
 * }
 * public void setName(String name){
 * this.name = name;
 * }
 * public String getName(){
 * return this.name;
 * }
 * public void setDescription_web(String description_web){
 * this.description_web = description_web;
 * }
 * public String getDescription_web(){
 * return this.description_web;
 * }
 * public void setAddress_zip(int address_zip){
 * this.address_zip = address_zip;
 * }
 * public int getAddress_zip(){
 * return this.address_zip;
 * }
 * public void setSort_order(String sort_order){
 * this.sort_order = sort_order;
 * }
 * public String getSort_order(){
 * return this.sort_order;
 * }
 * public void setEmail(String email){
 * this.email = email;
 * }
 * public String getEmail(){
 * return this.email;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Pt
 * {
 * private int address_street_number;
 * <p>
 * private String website;
 * <p>
 * private String address_street_name;
 * <p>
 * private String booking_url;
 * <p>
 * private String address_street_box;
 * <p>
 * private String phone_booking;
 * <p>
 * private String address_city;
 * <p>
 * private String description_print;
 * <p>
 * private String phone_contact;
 * <p>
 * private String address_line2;
 * <p>
 * private String address_line1;
 * <p>
 * private String name;
 * <p>
 * private String description_web;
 * <p>
 * private int address_zip;
 * <p>
 * private String sort_order;
 * <p>
 * private String email;
 * <p>
 * public void setAddress_street_number(int address_street_number){
 * this.address_street_number = address_street_number;
 * }
 * public int getAddress_street_number(){
 * return this.address_street_number;
 * }
 * public void setWebsite(String website){
 * this.website = website;
 * }
 * public String getWebsite(){
 * return this.website;
 * }
 * public void setAddress_street_name(String address_street_name){
 * this.address_street_name = address_street_name;
 * }
 * public String getAddress_street_name(){
 * return this.address_street_name;
 * }
 * public void setBooking_url(String booking_url){
 * this.booking_url = booking_url;
 * }
 * public String getBooking_url(){
 * return this.booking_url;
 * }
 * public void setAddress_street_box(String address_street_box){
 * this.address_street_box = address_street_box;
 * }
 * public String getAddress_street_box(){
 * return this.address_street_box;
 * }
 * public void setPhone_booking(String phone_booking){
 * this.phone_booking = phone_booking;
 * }
 * public String getPhone_booking(){
 * return this.phone_booking;
 * }
 * public void setAddress_city(String address_city){
 * this.address_city = address_city;
 * }
 * public String getAddress_city(){
 * return this.address_city;
 * }
 * public void setDescription_print(String description_print){
 * this.description_print = description_print;
 * }
 * public String getDescription_print(){
 * return this.description_print;
 * }
 * public void setPhone_contact(String phone_contact){
 * this.phone_contact = phone_contact;
 * }
 * public String getPhone_contact(){
 * return this.phone_contact;
 * }
 * public void setAddress_line2(String address_line2){
 * this.address_line2 = address_line2;
 * }
 * public String getAddress_line2(){
 * return this.address_line2;
 * }
 * public void setAddress_line1(String address_line1){
 * this.address_line1 = address_line1;
 * }
 * public String getAddress_line1(){
 * return this.address_line1;
 * }
 * public void setName(String name){
 * this.name = name;
 * }
 * public String getName(){
 * return this.name;
 * }
 * public void setDescription_web(String description_web){
 * this.description_web = description_web;
 * }
 * public String getDescription_web(){
 * return this.description_web;
 * }
 * public void setAddress_zip(int address_zip){
 * this.address_zip = address_zip;
 * }
 * public int getAddress_zip(){
 * return this.address_zip;
 * }
 * public void setSort_order(String sort_order){
 * this.sort_order = sort_order;
 * }
 * public String getSort_order(){
 * return this.sort_order;
 * }
 * public void setEmail(String email){
 * this.email = email;
 * }
 * public String getEmail(){
 * return this.email;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class En
 * {
 * private int address_street_number;
 * <p>
 * private String website;
 * <p>
 * private String address_street_name;
 * <p>
 * private String booking_url;
 * <p>
 * private String address_street_box;
 * <p>
 * private String phone_booking;
 * <p>
 * private String address_city;
 * <p>
 * private String description_print;
 * <p>
 * private String phone_contact;
 * <p>
 * private String address_line2;
 * <p>
 * private String address_line1;
 * <p>
 * private String name;
 * <p>
 * private String description_web;
 * <p>
 * private int address_zip;
 * <p>
 * private String sort_order;
 * <p>
 * private String email;
 * <p>
 * public void setAddress_street_number(int address_street_number){
 * this.address_street_number = address_street_number;
 * }
 * public int getAddress_street_number(){
 * return this.address_street_number;
 * }
 * public void setWebsite(String website){
 * this.website = website;
 * }
 * public String getWebsite(){
 * return this.website;
 * }
 * public void setAddress_street_name(String address_street_name){
 * this.address_street_name = address_street_name;
 * }
 * public String getAddress_street_name(){
 * return this.address_street_name;
 * }
 * public void setBooking_url(String booking_url){
 * this.booking_url = booking_url;
 * }
 * public String getBooking_url(){
 * return this.booking_url;
 * }
 * public void setAddress_street_box(String address_street_box){
 * this.address_street_box = address_street_box;
 * }
 * public String getAddress_street_box(){
 * return this.address_street_box;
 * }
 * public void setPhone_booking(String phone_booking){
 * this.phone_booking = phone_booking;
 * }
 * public String getPhone_booking(){
 * return this.phone_booking;
 * }
 * public void setAddress_city(String address_city){
 * this.address_city = address_city;
 * }
 * public String getAddress_city(){
 * return this.address_city;
 * }
 * public void setDescription_print(String description_print){
 * this.description_print = description_print;
 * }
 * public String getDescription_print(){
 * return this.description_print;
 * }
 * public void setPhone_contact(String phone_contact){
 * this.phone_contact = phone_contact;
 * }
 * public String getPhone_contact(){
 * return this.phone_contact;
 * }
 * public void setAddress_line2(String address_line2){
 * this.address_line2 = address_line2;
 * }
 * public String getAddress_line2(){
 * return this.address_line2;
 * }
 * public void setAddress_line1(String address_line1){
 * this.address_line1 = address_line1;
 * }
 * public String getAddress_line1(){
 * return this.address_line1;
 * }
 * public void setName(String name){
 * this.name = name;
 * }
 * public String getName(){
 * return this.name;
 * }
 * public void setDescription_web(String description_web){
 * this.description_web = description_web;
 * }
 * public String getDescription_web(){
 * return this.description_web;
 * }
 * public void setAddress_zip(int address_zip){
 * this.address_zip = address_zip;
 * }
 * public int getAddress_zip(){
 * return this.address_zip;
 * }
 * public void setSort_order(String sort_order){
 * this.sort_order = sort_order;
 * }
 * public String getSort_order(){
 * return this.sort_order;
 * }
 * public void setEmail(String email){
 * this.email = email;
 * }
 * public String getEmail(){
 * return this.email;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class It
 * {
 * private int address_street_number;
 * <p>
 * private String website;
 * <p>
 * private String address_street_name;
 * <p>
 * private String booking_url;
 * <p>
 * private String address_street_box;
 * <p>
 * private String phone_booking;
 * <p>
 * private String address_city;
 * <p>
 * private String description_print;
 * <p>
 * private String phone_contact;
 * <p>
 * private String address_line2;
 * <p>
 * private String address_line1;
 * <p>
 * private String name;
 * <p>
 * private String description_web;
 * <p>
 * private int address_zip;
 * <p>
 * private String sort_order;
 * <p>
 * private String email;
 * <p>
 * public void setAddress_street_number(int address_street_number){
 * this.address_street_number = address_street_number;
 * }
 * public int getAddress_street_number(){
 * return this.address_street_number;
 * }
 * public void setWebsite(String website){
 * this.website = website;
 * }
 * public String getWebsite(){
 * return this.website;
 * }
 * public void setAddress_street_name(String address_street_name){
 * this.address_street_name = address_street_name;
 * }
 * public String getAddress_street_name(){
 * return this.address_street_name;
 * }
 * public void setBooking_url(String booking_url){
 * this.booking_url = booking_url;
 * }
 * public String getBooking_url(){
 * return this.booking_url;
 * }
 * public void setAddress_street_box(String address_street_box){
 * this.address_street_box = address_street_box;
 * }
 * public String getAddress_street_box(){
 * return this.address_street_box;
 * }
 * public void setPhone_booking(String phone_booking){
 * this.phone_booking = phone_booking;
 * }
 * public String getPhone_booking(){
 * return this.phone_booking;
 * }
 * public void setAddress_city(String address_city){
 * this.address_city = address_city;
 * }
 * public String getAddress_city(){
 * return this.address_city;
 * }
 * public void setDescription_print(String description_print){
 * this.description_print = description_print;
 * }
 * public String getDescription_print(){
 * return this.description_print;
 * }
 * public void setPhone_contact(String phone_contact){
 * this.phone_contact = phone_contact;
 * }
 * public String getPhone_contact(){
 * return this.phone_contact;
 * }
 * public void setAddress_line2(String address_line2){
 * this.address_line2 = address_line2;
 * }
 * public String getAddress_line2(){
 * return this.address_line2;
 * }
 * public void setAddress_line1(String address_line1){
 * this.address_line1 = address_line1;
 * }
 * public String getAddress_line1(){
 * return this.address_line1;
 * }
 * public void setName(String name){
 * this.name = name;
 * }
 * public String getName(){
 * return this.name;
 * }
 * public void setDescription_web(String description_web){
 * this.description_web = description_web;
 * }
 * public String getDescription_web(){
 * return this.description_web;
 * }
 * public void setAddress_zip(int address_zip){
 * this.address_zip = address_zip;
 * }
 * public int getAddress_zip(){
 * return this.address_zip;
 * }
 * public void setSort_order(String sort_order){
 * this.sort_order = sort_order;
 * }
 * public String getSort_order(){
 * return this.sort_order;
 * }
 * public void setEmail(String email){
 * this.email = email;
 * }
 * public String getEmail(){
 * return this.email;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Cn
 * {
 * private int address_street_number;
 * <p>
 * private String website;
 * <p>
 * private String address_street_name;
 * <p>
 * private String booking_url;
 * <p>
 * private String address_street_box;
 * <p>
 * private String phone_booking;
 * <p>
 * private String address_city;
 * <p>
 * private String description_print;
 * <p>
 * private String phone_contact;
 * <p>
 * private String address_line2;
 * <p>
 * private String address_line1;
 * <p>
 * private String name;
 * <p>
 * private String description_web;
 * <p>
 * private int address_zip;
 * <p>
 * private String sort_order;
 * <p>
 * private String email;
 * <p>
 * public void setAddress_street_number(int address_street_number){
 * this.address_street_number = address_street_number;
 * }
 * public int getAddress_street_number(){
 * return this.address_street_number;
 * }
 * public void setWebsite(String website){
 * this.website = website;
 * }
 * public String getWebsite(){
 * return this.website;
 * }
 * public void setAddress_street_name(String address_street_name){
 * this.address_street_name = address_street_name;
 * }
 * public String getAddress_street_name(){
 * return this.address_street_name;
 * }
 * public void setBooking_url(String booking_url){
 * this.booking_url = booking_url;
 * }
 * public String getBooking_url(){
 * return this.booking_url;
 * }
 * public void setAddress_street_box(String address_street_box){
 * this.address_street_box = address_street_box;
 * }
 * public String getAddress_street_box(){
 * return this.address_street_box;
 * }
 * public void setPhone_booking(String phone_booking){
 * this.phone_booking = phone_booking;
 * }
 * public String getPhone_booking(){
 * return this.phone_booking;
 * }
 * public void setAddress_city(String address_city){
 * this.address_city = address_city;
 * }
 * public String getAddress_city(){
 * return this.address_city;
 * }
 * public void setDescription_print(String description_print){
 * this.description_print = description_print;
 * }
 * public String getDescription_print(){
 * return this.description_print;
 * }
 * public void setPhone_contact(String phone_contact){
 * this.phone_contact = phone_contact;
 * }
 * public String getPhone_contact(){
 * return this.phone_contact;
 * }
 * public void setAddress_line2(String address_line2){
 * this.address_line2 = address_line2;
 * }
 * public String getAddress_line2(){
 * return this.address_line2;
 * }
 * public void setAddress_line1(String address_line1){
 * this.address_line1 = address_line1;
 * }
 * public String getAddress_line1(){
 * return this.address_line1;
 * }
 * public void setName(String name){
 * this.name = name;
 * }
 * public String getName(){
 * return this.name;
 * }
 * public void setDescription_web(String description_web){
 * this.description_web = description_web;
 * }
 * public String getDescription_web(){
 * return this.description_web;
 * }
 * public void setAddress_zip(int address_zip){
 * this.address_zip = address_zip;
 * }
 * public int getAddress_zip(){
 * return this.address_zip;
 * }
 * public void setSort_order(String sort_order){
 * this.sort_order = sort_order;
 * }
 * public String getSort_order(){
 * return this.sort_order;
 * }
 * public void setEmail(String email){
 * this.email = email;
 * }
 * public String getEmail(){
 * return this.email;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Fr
 * {
 * private int address_street_number;
 * <p>
 * private String website;
 * <p>
 * private String address_street_name;
 * <p>
 * private String booking_url;
 * <p>
 * private String address_street_box;
 * <p>
 * private String phone_booking;
 * <p>
 * private String address_city;
 * <p>
 * private String description_print;
 * <p>
 * private String phone_contact;
 * <p>
 * private String address_line2;
 * <p>
 * private String address_line1;
 * <p>
 * private String name;
 * <p>
 * private String description_web;
 * <p>
 * private int address_zip;
 * <p>
 * private String sort_order;
 * <p>
 * private String email;
 * <p>
 * public void setAddress_street_number(int address_street_number){
 * this.address_street_number = address_street_number;
 * }
 * public int getAddress_street_number(){
 * return this.address_street_number;
 * }
 * public void setWebsite(String website){
 * this.website = website;
 * }
 * public String getWebsite(){
 * return this.website;
 * }
 * public void setAddress_street_name(String address_street_name){
 * this.address_street_name = address_street_name;
 * }
 * public String getAddress_street_name(){
 * return this.address_street_name;
 * }
 * public void setBooking_url(String booking_url){
 * this.booking_url = booking_url;
 * }
 * public String getBooking_url(){
 * return this.booking_url;
 * }
 * public void setAddress_street_box(String address_street_box){
 * this.address_street_box = address_street_box;
 * }
 * public String getAddress_street_box(){
 * return this.address_street_box;
 * }
 * public void setPhone_booking(String phone_booking){
 * this.phone_booking = phone_booking;
 * }
 * public String getPhone_booking(){
 * return this.phone_booking;
 * }
 * public void setAddress_city(String address_city){
 * this.address_city = address_city;
 * }
 * public String getAddress_city(){
 * return this.address_city;
 * }
 * public void setDescription_print(String description_print){
 * this.description_print = description_print;
 * }
 * public String getDescription_print(){
 * return this.description_print;
 * }
 * public void setPhone_contact(String phone_contact){
 * this.phone_contact = phone_contact;
 * }
 * public String getPhone_contact(){
 * return this.phone_contact;
 * }
 * public void setAddress_line2(String address_line2){
 * this.address_line2 = address_line2;
 * }
 * public String getAddress_line2(){
 * return this.address_line2;
 * }
 * public void setAddress_line1(String address_line1){
 * this.address_line1 = address_line1;
 * }
 * public String getAddress_line1(){
 * return this.address_line1;
 * }
 * public void setName(String name){
 * this.name = name;
 * }
 * public String getName(){
 * return this.name;
 * }
 * public void setDescription_web(String description_web){
 * this.description_web = description_web;
 * }
 * public String getDescription_web(){
 * return this.description_web;
 * }
 * public void setAddress_zip(int address_zip){
 * this.address_zip = address_zip;
 * }
 * public int getAddress_zip(){
 * return this.address_zip;
 * }
 * public void setSort_order(String sort_order){
 * this.sort_order = sort_order;
 * }
 * public String getSort_order(){
 * return this.sort_order;
 * }
 * public void setEmail(String email){
 * this.email = email;
 * }
 * public String getEmail(){
 * return this.email;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Sp
 * {
 * private int address_street_number;
 * <p>
 * private String website;
 * <p>
 * private String address_street_name;
 * <p>
 * private String booking_url;
 * <p>
 * private String address_street_box;
 * <p>
 * private String phone_booking;
 * <p>
 * private String address_city;
 * <p>
 * private String description_print;
 * <p>
 * private String phone_contact;
 * <p>
 * private String address_line2;
 * <p>
 * private String address_line1;
 * <p>
 * private String name;
 * <p>
 * private String description_web;
 * <p>
 * private int address_zip;
 * <p>
 * private String sort_order;
 * <p>
 * private String email;
 * <p>
 * public void setAddress_street_number(int address_street_number){
 * this.address_street_number = address_street_number;
 * }
 * public int getAddress_street_number(){
 * return this.address_street_number;
 * }
 * public void setWebsite(String website){
 * this.website = website;
 * }
 * public String getWebsite(){
 * return this.website;
 * }
 * public void setAddress_street_name(String address_street_name){
 * this.address_street_name = address_street_name;
 * }
 * public String getAddress_street_name(){
 * return this.address_street_name;
 * }
 * public void setBooking_url(String booking_url){
 * this.booking_url = booking_url;
 * }
 * public String getBooking_url(){
 * return this.booking_url;
 * }
 * public void setAddress_street_box(String address_street_box){
 * this.address_street_box = address_street_box;
 * }
 * public String getAddress_street_box(){
 * return this.address_street_box;
 * }
 * public void setPhone_booking(String phone_booking){
 * this.phone_booking = phone_booking;
 * }
 * public String getPhone_booking(){
 * return this.phone_booking;
 * }
 * public void setAddress_city(String address_city){
 * this.address_city = address_city;
 * }
 * public String getAddress_city(){
 * return this.address_city;
 * }
 * public void setDescription_print(String description_print){
 * this.description_print = description_print;
 * }
 * public String getDescription_print(){
 * return this.description_print;
 * }
 * public void setPhone_contact(String phone_contact){
 * this.phone_contact = phone_contact;
 * }
 * public String getPhone_contact(){
 * return this.phone_contact;
 * }
 * public void setAddress_line2(String address_line2){
 * this.address_line2 = address_line2;
 * }
 * public String getAddress_line2(){
 * return this.address_line2;
 * }
 * public void setAddress_line1(String address_line1){
 * this.address_line1 = address_line1;
 * }
 * public String getAddress_line1(){
 * return this.address_line1;
 * }
 * public void setName(String name){
 * this.name = name;
 * }
 * public String getName(){
 * return this.name;
 * }
 * public void setDescription_web(String description_web){
 * this.description_web = description_web;
 * }
 * public String getDescription_web(){
 * return this.description_web;
 * }
 * public void setAddress_zip(int address_zip){
 * this.address_zip = address_zip;
 * }
 * public int getAddress_zip(){
 * return this.address_zip;
 * }
 * public void setSort_order(String sort_order){
 * this.sort_order = sort_order;
 * }
 * public String getSort_order(){
 * return this.sort_order;
 * }
 * public void setEmail(String email){
 * this.email = email;
 * }
 * public String getEmail(){
 * return this.email;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Nl
 * {
 * private int address_street_number;
 * <p>
 * private String website;
 * <p>
 * private String address_street_name;
 * <p>
 * private String booking_url;
 * <p>
 * private String address_street_box;
 * <p>
 * private String phone_booking;
 * <p>
 * private String address_city;
 * <p>
 * private String description_print;
 * <p>
 * private String phone_contact;
 * <p>
 * private String address_line2;
 * <p>
 * private String address_line1;
 * <p>
 * private String name;
 * <p>
 * private String description_web;
 * <p>
 * private int address_zip;
 * <p>
 * private String sort_order;
 * <p>
 * private String email;
 * <p>
 * public void setAddress_street_number(int address_street_number){
 * this.address_street_number = address_street_number;
 * }
 * public int getAddress_street_number(){
 * return this.address_street_number;
 * }
 * public void setWebsite(String website){
 * this.website = website;
 * }
 * public String getWebsite(){
 * return this.website;
 * }
 * public void setAddress_street_name(String address_street_name){
 * this.address_street_name = address_street_name;
 * }
 * public String getAddress_street_name(){
 * return this.address_street_name;
 * }
 * public void setBooking_url(String booking_url){
 * this.booking_url = booking_url;
 * }
 * public String getBooking_url(){
 * return this.booking_url;
 * }
 * public void setAddress_street_box(String address_street_box){
 * this.address_street_box = address_street_box;
 * }
 * public String getAddress_street_box(){
 * return this.address_street_box;
 * }
 * public void setPhone_booking(String phone_booking){
 * this.phone_booking = phone_booking;
 * }
 * public String getPhone_booking(){
 * return this.phone_booking;
 * }
 * public void setAddress_city(String address_city){
 * this.address_city = address_city;
 * }
 * public String getAddress_city(){
 * return this.address_city;
 * }
 * public void setDescription_print(String description_print){
 * this.description_print = description_print;
 * }
 * public String getDescription_print(){
 * return this.description_print;
 * }
 * public void setPhone_contact(String phone_contact){
 * this.phone_contact = phone_contact;
 * }
 * public String getPhone_contact(){
 * return this.phone_contact;
 * }
 * public void setAddress_line2(String address_line2){
 * this.address_line2 = address_line2;
 * }
 * public String getAddress_line2(){
 * return this.address_line2;
 * }
 * public void setAddress_line1(String address_line1){
 * this.address_line1 = address_line1;
 * }
 * public String getAddress_line1(){
 * return this.address_line1;
 * }
 * public void setName(String name){
 * this.name = name;
 * }
 * public String getName(){
 * return this.name;
 * }
 * public void setDescription_web(String description_web){
 * this.description_web = description_web;
 * }
 * public String getDescription_web(){
 * return this.description_web;
 * }
 * public void setAddress_zip(int address_zip){
 * this.address_zip = address_zip;
 * }
 * public int getAddress_zip(){
 * return this.address_zip;
 * }
 * public void setSort_order(String sort_order){
 * this.sort_order = sort_order;
 * }
 * public String getSort_order(){
 * return this.sort_order;
 * }
 * public void setEmail(String email){
 * this.email = email;
 * }
 * public String getEmail(){
 * return this.email;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Translations
 * {
 * private De de;
 * <p>
 * private Pt pt;
 * <p>
 * private En en;
 * <p>
 * private It it;
 * <p>
 * private Cn cn;
 * <p>
 * private Fr fr;
 * <p>
 * private Sp sp;
 * <p>
 * private Nl nl;
 * <p>
 * public void setDe(De de){
 * this.de = de;
 * }
 * public De getDe(){
 * return this.de;
 * }
 * public void setPt(Pt pt){
 * this.pt = pt;
 * }
 * public Pt getPt(){
 * return this.pt;
 * }
 * public void setEn(En en){
 * this.en = en;
 * }
 * public En getEn(){
 * return this.en;
 * }
 * public void setIt(It it){
 * this.it = it;
 * }
 * public It getIt(){
 * return this.it;
 * }
 * public void setCn(Cn cn){
 * this.cn = cn;
 * }
 * public Cn getCn(){
 * return this.cn;
 * }
 * public void setFr(Fr fr){
 * this.fr = fr;
 * }
 * public Fr getFr(){
 * return this.fr;
 * }
 * public void setSp(Sp sp){
 * this.sp = sp;
 * }
 * public Sp getSp(){
 * return this.sp;
 * }
 * public void setNl(Nl nl){
 * this.nl = nl;
 * }
 * public Nl getNl(){
 * return this.nl;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Location
 * {
 * private double lon;
 * <p>
 * private double lat;
 * <p>
 * public void setLon(double lon){
 * this.lon = lon;
 * }
 * public double getLon(){
 * return this.lon;
 * }
 * public void setLat(double lat){
 * this.lat = lat;
 * }
 * public double getLat(){
 * return this.lat;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Organizer
 * {
 * private String neca;
 * <p>
 * private String external_id;
 * <p>
 * private String facebook_id;
 * <p>
 * private boolean is_in_address_book;
 * <p>
 * private Translations translations;
 * <p>
 * private String last_updated_at;
 * <p>
 * private Location location;
 * <p>
 * private String import_origin;
 * <p>
 * private int id;
 * <p>
 * private boolean is_in_vb_export;
 * <p>
 * private String region;
 * <p>
 * private String published_at;
 * <p>
 * private int backoffice_id;
 * <p>
 * public void setNeca(String neca){
 * this.neca = neca;
 * }
 * public String getNeca(){
 * return this.neca;
 * }
 * public void setExternal_id(String external_id){
 * this.external_id = external_id;
 * }
 * public String getExternal_id(){
 * return this.external_id;
 * }
 * public void setFacebook_id(String facebook_id){
 * this.facebook_id = facebook_id;
 * }
 * public String getFacebook_id(){
 * return this.facebook_id;
 * }
 * public void setIs_in_address_book(boolean is_in_address_book){
 * this.is_in_address_book = is_in_address_book;
 * }
 * public boolean getIs_in_address_book(){
 * return this.is_in_address_book;
 * }
 * public void setTranslations(Translations translations){
 * this.translations = translations;
 * }
 * public Translations getTranslations(){
 * return this.translations;
 * }
 * public void setLast_updated_at(String last_updated_at){
 * this.last_updated_at = last_updated_at;
 * }
 * public String getLast_updated_at(){
 * return this.last_updated_at;
 * }
 * public void setLocation(Location location){
 * this.location = location;
 * }
 * public Location getLocation(){
 * return this.location;
 * }
 * public void setImport_origin(String import_origin){
 * this.import_origin = import_origin;
 * }
 * public String getImport_origin(){
 * return this.import_origin;
 * }
 * public void setId(int id){
 * this.id = id;
 * }
 * public int getId(){
 * return this.id;
 * }
 * public void setIs_in_vb_export(boolean is_in_vb_export){
 * this.is_in_vb_export = is_in_vb_export;
 * }
 * public boolean getIs_in_vb_export(){
 * return this.is_in_vb_export;
 * }
 * public void setRegion(String region){
 * this.region = region;
 * }
 * public String getRegion(){
 * return this.region;
 * }
 * public void setPublished_at(String published_at){
 * this.published_at = published_at;
 * }
 * public String getPublished_at(){
 * return this.published_at;
 * }
 * public void setBackoffice_id(int backoffice_id){
 * this.backoffice_id = backoffice_id;
 * }
 * public int getBackoffice_id(){
 * return this.backoffice_id;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * import java.util.ArrayList;
 * import java.util.List;
 * public class Event
 * {
 * private DateTime date_next;
 * <p>
 * private Weekschema weekschema;
 * <p>
 * private String facebook_link;
 * <p>
 * private List<Media> media;
 * <p>
 * private Visit_profile visit_profile;
 * <p>
 * private Accessibilities accessibilities;
 * <p>
 * private boolean accept_article27;
 * <p>
 * private Targets targets;
 * <p>
 * private String publication_state;
 * <p>
 * private String sub_type;
 * <p>
 * private boolean is_closed_on_school_holidays;
 * <p>
 * private Translations translations;
 * <p>
 * private boolean is_by_appointment;
 * <p>
 * private String import_origin;
 * <p>
 * private int id;
 * <p>
 * private boolean is_online;
 * <p>
 * private Categories categories;
 * <p>
 * private Place place;
 * <p>
 * private boolean accept_cultuurbon;
 * <p>
 * private List<Prices> prices;
 * <p>
 * private String published_at;
 * <p>
 * private Languages languages;
 * <p>
 * private DateTime date_end;
 * <p>
 * private List<Dates> dates;
 * <p>
 * private boolean is_permanent;
 * <p>
 * private boolean is_closed_on_public_holidays;
 * <p>
 * private DateTime date_start;
 * <p>
 * private boolean show_in_agenda;
 * <p>
 * private Organizer organizer;
 * <p>
 * private String last_updated_at;
 * <p>
 * private boolean is_free;
 * <p>
 * private double ranking;
 * <p>
 * private int backoffice_id;
 * <p>
 * private boolean accept_paspartoe;
 * <p>
 * public void setDate_next(DateTime date_next){
 * this.date_next = date_next;
 * }
 * public DateTime getDate_next(){
 * return this.date_next;
 * }
 * public void setWeekschema(Weekschema weekschema){
 * this.weekschema = weekschema;
 * }
 * public Weekschema getWeekschema(){
 * return this.weekschema;
 * }
 * public void setFacebook_link(String facebook_link){
 * this.facebook_link = facebook_link;
 * }
 * public String getFacebook_link(){
 * return this.facebook_link;
 * }
 * public void setMedia(List<Media> media){
 * this.media = media;
 * }
 * public List<Media> getMedia(){
 * return this.media;
 * }
 * public void setVisit_profile(Visit_profile visit_profile){
 * this.visit_profile = visit_profile;
 * }
 * public Visit_profile getVisit_profile(){
 * return this.visit_profile;
 * }
 * public void setAccessibilities(Accessibilities accessibilities){
 * this.accessibilities = accessibilities;
 * }
 * public Accessibilities getAccessibilities(){
 * return this.accessibilities;
 * }
 * public void setAccept_article27(boolean accept_article27){
 * this.accept_article27 = accept_article27;
 * }
 * public boolean getAccept_article27(){
 * return this.accept_article27;
 * }
 * public void setTargets(Targets targets){
 * this.targets = targets;
 * }
 * public Targets getTargets(){
 * return this.targets;
 * }
 * public void setPublication_state(String publication_state){
 * this.publication_state = publication_state;
 * }
 * public String getPublication_state(){
 * return this.publication_state;
 * }
 * public void setSub_type(String sub_type){
 * this.sub_type = sub_type;
 * }
 * public String getSub_type(){
 * return this.sub_type;
 * }
 * public void setIs_closed_on_school_holidays(boolean is_closed_on_school_holidays){
 * this.is_closed_on_school_holidays = is_closed_on_school_holidays;
 * }
 * public boolean getIs_closed_on_school_holidays(){
 * return this.is_closed_on_school_holidays;
 * }
 * public void setTranslations(Translations translations){
 * this.translations = translations;
 * }
 * public Translations getTranslations(){
 * return this.translations;
 * }
 * public void setIs_by_appointment(boolean is_by_appointment){
 * this.is_by_appointment = is_by_appointment;
 * }
 * public boolean getIs_by_appointment(){
 * return this.is_by_appointment;
 * }
 * public void setImport_origin(String import_origin){
 * this.import_origin = import_origin;
 * }
 * public String getImport_origin(){
 * return this.import_origin;
 * }
 * public void setId(int id){
 * this.id = id;
 * }
 * public int getId(){
 * return this.id;
 * }
 * public void setIs_online(boolean is_online){
 * this.is_online = is_online;
 * }
 * public boolean getIs_online(){
 * return this.is_online;
 * }
 * public void setCategories(Categories categories){
 * this.categories = categories;
 * }
 * public Categories getCategories(){
 * return this.categories;
 * }
 * public void setPlace(Place place){
 * this.place = place;
 * }
 * public Place getPlace(){
 * return this.place;
 * }
 * public void setAccept_cultuurbon(boolean accept_cultuurbon){
 * this.accept_cultuurbon = accept_cultuurbon;
 * }
 * public boolean getAccept_cultuurbon(){
 * return this.accept_cultuurbon;
 * }
 * public void setPrices(List<Prices> prices){
 * this.prices = prices;
 * }
 * public List<Prices> getPrices(){
 * return this.prices;
 * }
 * public void setPublished_at(String published_at){
 * this.published_at = published_at;
 * }
 * public String getPublished_at(){
 * return this.published_at;
 * }
 * public void setLanguages(Languages languages){
 * this.languages = languages;
 * }
 * public Languages getLanguages(){
 * return this.languages;
 * }
 * public void setDate_end(DateTime date_end){
 * this.date_end = date_end;
 * }
 * public DateTime getDate_end(){
 * return this.date_end;
 * }
 * public void setDates(List<Dates> dates){
 * this.dates = dates;
 * }
 * public List<Dates> getDates(){
 * return this.dates;
 * }
 * public void setIs_permanent(boolean is_permanent){
 * this.is_permanent = is_permanent;
 * }
 * public boolean getIs_permanent(){
 * return this.is_permanent;
 * }
 * public void setIs_closed_on_public_holidays(boolean is_closed_on_public_holidays){
 * this.is_closed_on_public_holidays = is_closed_on_public_holidays;
 * }
 * public boolean getIs_closed_on_public_holidays(){
 * return this.is_closed_on_public_holidays;
 * }
 * public void setDate_start(DateTime date_start){
 * this.date_start = date_start;
 * }
 * public DateTime getDate_start(){
 * return this.date_start;
 * }
 * public void setShow_in_agenda(boolean show_in_agenda){
 * this.show_in_agenda = show_in_agenda;
 * }
 * public boolean getShow_in_agenda(){
 * return this.show_in_agenda;
 * }
 * public void setOrganizer(Organizer organizer){
 * this.organizer = organizer;
 * }
 * public Organizer getOrganizer(){
 * return this.organizer;
 * }
 * public void setLast_updated_at(String last_updated_at){
 * this.last_updated_at = last_updated_at;
 * }
 * public String getLast_updated_at(){
 * return this.last_updated_at;
 * }
 * public void setIs_free(boolean is_free){
 * this.is_free = is_free;
 * }
 * public boolean getIs_free(){
 * return this.is_free;
 * }
 * public void setRanking(double ranking){
 * this.ranking = ranking;
 * }
 * public double getRanking(){
 * return this.ranking;
 * }
 * public void setBackoffice_id(int backoffice_id){
 * this.backoffice_id = backoffice_id;
 * }
 * public int getBackoffice_id(){
 * return this.backoffice_id;
 * }
 * public void setAccept_paspartoe(boolean accept_paspartoe){
 * this.accept_paspartoe = accept_paspartoe;
 * }
 * public boolean getAccept_paspartoe(){
 * return this.accept_paspartoe;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * import java.util.ArrayList;
 * import java.util.List;
 * public class Results
 * {
 * private List<Event> event;
 * <p>
 * public void setEvent(List<Event> event){
 * this.event = event;
 * }
 * public List<Event> getEvent(){
 * return this.event;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Response
 * {
 * <p>
 * <p>
 * public void setPage(int page){
 * this.page = page;
 * }
 * public int getPage(){
 * return this.page;
 * }
 * public void setPageCount(int pageCount){
 * this.pageCount = pageCount;
 * }
 * public int getPageCount(){
 * return this.pageCount;
 * }
 * public void setResultCount(int resultCount){
 * this.resultCount = resultCount;
 * }
 * public int getResultCount(){
 * return this.resultCount;
 * }
 * public void setResults(Results results){
 * this.results = results;
 * }
 * public Results getResults(){
 * return this.results;
 * }
 * }
 * <p>
 * ==================================
 * package ;
 * public class Root
 * {
 * private Response response;
 * <p>
 * public void setResponse(Response response){
 * this.response = response;
 * }
 * public Response getResponse(){
 * return this.response;
 * }
 * }
 * <p>
 * }
 */