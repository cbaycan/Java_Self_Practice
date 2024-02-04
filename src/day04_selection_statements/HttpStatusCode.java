package day04_selection_statements;

public class HttpStatusCode {
    public static void main(String[] args) {

        int statusCode = 304;
        String result = "";

        switch (statusCode){
            case 200 -> result= "OK";
            case 201-> result= "Created";
                    case 202-> result=  "Accepted";
                    case 301-> result=  "Moved Permanently";
                case 303-> result=  "See Other";
                case 304-> result=  "Not Modified";
                case 307-> result= "Temporary Redirect";
                case 400-> result= "Bad Request";
                    case 401-> result=  "Unauthorized";
                case 403-> result= "Forbidden";
                case 404-> result=  "Not Found";
                    case 410-> result= "Gone";
                case 500-> result= "Internal Server Error";
                case 503-> result= "Service Unavailable";
            default -> result ="invalid";

        }
        System.out.println(result);



    }
}

/*
            200, OK
			201, Created
			202, Accepted
			301, Moved Permanently
			303, See Other
			304, Not Modified
			307, Temporary Redirect
			400, Bad Request
			401, Unauthorized
			403, Forbidden
			404, Not Found
			410, Gone
			500, Internal Server Error
			503, Service Unavailable
 */