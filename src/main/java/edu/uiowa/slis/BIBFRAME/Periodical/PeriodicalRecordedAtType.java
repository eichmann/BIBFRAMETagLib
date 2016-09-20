package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalRecordedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalRecordedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalRecordedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalRecordedAtIterator thePeriodicalRecordedAtIterator = (PeriodicalRecordedAtIterator)findAncestorWithClass(this, PeriodicalRecordedAtIterator.class);
			pageContext.getOut().print(thePeriodicalRecordedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for recordedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for recordedAt tag ");
		}
		return SKIP_BODY;
	}
}

