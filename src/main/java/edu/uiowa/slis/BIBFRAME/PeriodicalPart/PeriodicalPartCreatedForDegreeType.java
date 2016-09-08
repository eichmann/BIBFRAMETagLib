package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartCreatedForDegreeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartCreatedForDegreeType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartCreatedForDegreeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartCreatedForDegreeIterator thePeriodicalPartCreatedForDegreeIterator = (PeriodicalPartCreatedForDegreeIterator)findAncestorWithClass(this, PeriodicalPartCreatedForDegreeIterator.class);
			pageContext.getOut().print(thePeriodicalPartCreatedForDegreeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}

