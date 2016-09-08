package edu.uiowa.slis.BIBFRAME.StockNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StockNumberSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StockNumberSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(StockNumberSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			StockNumber theStockNumber = (StockNumber)findAncestorWithClass(this, StockNumber.class);
			if (!theStockNumber.commitNeeded) {
				pageContext.getOut().print(theStockNumber.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing StockNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing StockNumber for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			StockNumber theStockNumber = (StockNumber)findAncestorWithClass(this, StockNumber.class);
			return theStockNumber.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing StockNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing StockNumber for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			StockNumber theStockNumber = (StockNumber)findAncestorWithClass(this, StockNumber.class);
			theStockNumber.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing StockNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing StockNumber for subjectURI tag ");
		}
	}
}

