/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;


/**
 *
 * @author JuanAstaiza
 */
public class conversion_monedas {
    private String result;
    private String documentation;
    private String terms_of_use;
    private String time_last_update_unix;
    private String time_last_update_utc;
    private String time_next_update_unix;
    private String time_next_update_utc;
    private String base_code;
    private String target_code;
    private String conversion_rate;
    private String conversion_result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public String getTerms_of_use() {
        return terms_of_use;
    }

    public void setTerms_of_use(String terms_of_use) {
        this.terms_of_use = terms_of_use;
    }

    public String getTime_last_update_unix() {
        return time_last_update_unix;
    }

    public void setTime_last_update_unix(String time_last_update_unix) {
        this.time_last_update_unix = time_last_update_unix;
    }

    public String getTime_last_update_utc() {
        return time_last_update_utc;
    }

    public void setTime_last_update_utc(String time_last_update_utc) {
        this.time_last_update_utc = time_last_update_utc;
    }

    public String getTime_next_update_unix() {
        return time_next_update_unix;
    }

    public void setTime_next_update_unix(String time_next_update_unix) {
        this.time_next_update_unix = time_next_update_unix;
    }

    public String getTime_next_update_utc() {
        return time_next_update_utc;
    }

    public void setTime_next_update_utc(String time_next_update_utc) {
        this.time_next_update_utc = time_next_update_utc;
    }

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public void setTarget_code(String target_code) {
        this.target_code = target_code;
    }

    public String getConversion_rate() {
        return conversion_rate;
    }

    public void setConversion_rate(String conversion_rate) {
        this.conversion_rate = conversion_rate;
    }

    public String getConversion_result() {
        return conversion_result;
    }

    public void setConversion_result(String conversion_result) {
        this.conversion_result = conversion_result;
    }

    @Override
    public String toString() {
        return "\nHora de la ultima actualización Unix:" + time_last_update_unix +
               "'\nHora de la ultima actualización Utc:" + time_last_update_utc+
               "'\nHora de la proxima actualización Unix:" + time_next_update_unix + 
               "'\nHora de la proxima actualización Utc:" + time_next_update_utc;
    }

    

    
    
    
    
    
    
    
    
    
    

    
}
