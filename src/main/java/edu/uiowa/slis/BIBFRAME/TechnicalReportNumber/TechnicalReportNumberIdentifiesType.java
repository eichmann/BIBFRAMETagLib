package edu.uiowa.slis.BIBFRAME.TechnicalReportNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TechnicalReportNumberIdentifiesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TechnicalReportNumberIdentifiesType currentInstance = null;
	private static final Log log = LogFactory.getLog(TechnicalReportNumberIdentifiesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TechnicalReportNumberIdentifiesIterator theTechnicalReportNumberIdentifiesIterator = (TechnicalReportNumberIdentifiesIterator)findAncestorWithClass(this, TechnicalReportNumberIdentifiesIterator.class);
			pageContext.getOut().print(theTechnicalReportNumberIdentifiesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing TechnicalReportNumber for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing TechnicalReportNumber for identifies tag ");
		}
		return SKIP_BODY;
	}
}

