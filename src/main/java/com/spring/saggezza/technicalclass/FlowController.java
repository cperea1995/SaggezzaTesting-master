package com.spring.saggezza.technicalclass;

public class FlowController implements IFlowController {

    private IIntTester intTester;
    private IBoundaryChecker boundaryChecker;

    public FlowController(IIntTester intTester, IBoundaryChecker boundaryChecker) {
        this.intTester = intTester;
        this.boundaryChecker = boundaryChecker;

    }

    @Override
    public void run(String input) {
        if (intTester.isInteger(input)) {
            boundaryChecker.isInsideBoundary(Integer.parseInt(input));
        }
    }
}
