package edu.uiowa.slis.BIBFRAME.StockNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StockNumberLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StockNumberLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(StockNumberLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			StockNumber theStockNumber = (StockNumber)findAncestorWithClass(this, StockNumber.class);
			if (!theStockNumber.commitNeeded) {
				pageContext.getOut().print(theStockNumber.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing StockNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing StockNumber for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			StockNumber theStockNumber = (StockNumber)findAncestorWithClass(this, StockNumber.class);
			return theStockNumber.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing StockNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing StockNumber for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			StockNumber theStockNumber = (StockNumber)findAncestorWithClass(this, StockNumber.class);
			theStockNumber.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing StockNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing StockNumber for label tag ");
		}
	}
}

