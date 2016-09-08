package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalCreatedForDegree extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalCreatedForDegree currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalCreatedForDegree.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalCreatedForDegreeIterator thePeriodicalCreatedForDegreeIterator = (PeriodicalCreatedForDegreeIterator)findAncestorWithClass(this, PeriodicalCreatedForDegreeIterator.class);
			pageContext.getOut().print(thePeriodicalCreatedForDegreeIterator.getCreatedForDegree());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}

