package edu.uiowa.slis.BIBFRAME.StockNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StockNumberIdentifiesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StockNumberIdentifiesType currentInstance = null;
	private static final Log log = LogFactory.getLog(StockNumberIdentifiesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StockNumberIdentifiesIterator theStockNumberIdentifiesIterator = (StockNumberIdentifiesIterator)findAncestorWithClass(this, StockNumberIdentifiesIterator.class);
			pageContext.getOut().print(theStockNumberIdentifiesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StockNumber for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing StockNumber for identifies tag ");
		}
		return SKIP_BODY;
	}
}

