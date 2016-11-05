package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartSubjectType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartSubjectType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartSubjectType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartSubjectIterator thePeriodicalPartSubjectIterator = (PeriodicalPartSubjectIterator)findAncestorWithClass(this, PeriodicalPartSubjectIterator.class);
			pageContext.getOut().print(thePeriodicalPartSubjectIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for subject tag ");
		}
		return SKIP_BODY;
	}
}

