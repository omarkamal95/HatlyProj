package com.potato.hot.hatly;

public class User()
{
    private String first_name;
    private String last_name;
    private String date_of_birth;
    private String email;
    private String password;
    private String city;
    private String country;

        public String getFirstName()
        {
            return first_name;
        }

        public void setFirstName(String fn)
        {
            first_name = fn;
        }

        public String getLastName()
        {
            return last_name;
        }

        public void setLastName(String ln)
        {
            last_name = ln;
        }

        public String getDOB()
        {
            return date_of_birth;
        }

        public void setDOB(String DOB)
        {
            date_of_birth = DOB;
        }

        public String getEmail()
        {
            return email;
        }

        public void setEmail(String em)
        {
            email = em;
        }

        public String getPw()
        {
            return password;
        }

        public void setPw(String pw)
        {
            password = pw;
        }

        public String getCity()
        {
            return city;
        }

        public void setCity(String ct)
        {
            city = ct;
        }

        public String getCountry()
        {
            return country;
        }

        public void setCountry(String ctr)
        {
            country = ctr;
        }
}