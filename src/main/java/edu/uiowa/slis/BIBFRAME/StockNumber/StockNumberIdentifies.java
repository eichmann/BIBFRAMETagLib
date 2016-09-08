package edu.uiowa.slis.BIBFRAME.StockNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StockNumberIdentifies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StockNumberIdentifies currentInstance = null;
	private static final Log log = LogFactory.getLog(StockNumberIdentifies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StockNumberIdentifiesIterator theStockNumberIdentifiesIterator = (StockNumberIdentifiesIterator)findAncestorWithClass(this, StockNumberIdentifiesIterator.class);
			pageContext.getOut().print(theStockNumberIdentifiesIterator.getIdentifies());
		} catch (Exception e) {
			log.error("Can't find enclosing StockNumber for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing StockNumber for identifies tag ");
		}
		return SKIP_BODY;
	}
}

