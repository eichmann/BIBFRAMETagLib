package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartRecordedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartRecordedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartRecordedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartRecordedAtIterator thePeriodicalPartRecordedAtIterator = (PeriodicalPartRecordedAtIterator)findAncestorWithClass(this, PeriodicalPartRecordedAtIterator.class);
			pageContext.getOut().print(thePeriodicalPartRecordedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for recordedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for recordedAt tag ");
		}
		return SKIP_BODY;
	}
}

