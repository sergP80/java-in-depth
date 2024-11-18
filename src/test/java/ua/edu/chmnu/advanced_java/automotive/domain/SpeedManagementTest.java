package ua.edu.chmnu.advanced_java.automotive.domain;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ua.edu.chmnu.advanced_java.automotive.error.VehicleIllegalChangeException;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class SpeedManagementTest {

    @Mock
    private SpeedChangeable speedChangeable;

    @InjectMocks
    private SpeedManagement speedManagement;

    @ParameterizedTest
    @ValueSource(doubles = {33.5, -10.2})
    void shouldDelegateChangeSpeed(double delta) throws VehicleIllegalChangeException {

        speedManagement.change(delta);

        verify(speedChangeable).change(delta);
    }
}