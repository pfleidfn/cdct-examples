package com.example.debit.contract;

import static org.mockito.Mockito.when;

import org.junit.Before;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.debit.service.DebitService;

public class DebitBase extends MockMvcBase {

    @MockBean
    private DebitService debitService;

}
