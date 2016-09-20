package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartFormDesignation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartFormDesignation currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartFormDesignation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartFormDesignationIterator thePeriodicalPart = (PeriodicalPartFormDesignationIterator)findAncestorWithClass(this, PeriodicalPartFormDesignationIterator.class);
			pageContext.getOut().print(thePeriodicalPart.getFormDesignation());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for formDesignation tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for formDesignation tag ");
		}
		return SKIP_BODY;
	}
}

