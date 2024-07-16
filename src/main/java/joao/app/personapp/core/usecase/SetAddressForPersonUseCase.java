package joao.app.personapp.core.usecase;

public interface SetAddressForPersonUseCase {

    void execute(final String zipCode, final String personId);

}
