package joao.app.personapp.entrypoint.api.handler;

public record ErrorResponse(int status, String message, long timestampString) {

}
