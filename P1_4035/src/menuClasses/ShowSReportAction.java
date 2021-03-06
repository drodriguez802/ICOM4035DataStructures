
package menuClasses;

import dataManager.DMComponent;
import ioManagementClasses.IOComponent;
/**
 * Shows the menu to present a ShareHolder report
 * @author Daniel Rodriguez Garcia
 */
public class ShowSReportAction implements Action {

	@Override
	public void execute(Object arg) {
		DMComponent dm = (DMComponent) arg; 
		IOComponent io = IOComponent.getComponent(); 
		io.output("\nCompany: ");
		String symbol = io.getInput("Enter the symbol of the Company Shares to get report: "); 
		dm.showSReport(symbol);
			
	}

}
