package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalFormDesignation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalFormDesignation currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalFormDesignation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalFormDesignationIterator thePeriodical = (PeriodicalFormDesignationIterator)findAncestorWithClass(this, PeriodicalFormDesignationIterator.class);
			pageContext.getOut().print(thePeriodical.getFormDesignation());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for formDesignation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for formDesignation tag ");
		}
		return SKIP_BODY;
	}
}

