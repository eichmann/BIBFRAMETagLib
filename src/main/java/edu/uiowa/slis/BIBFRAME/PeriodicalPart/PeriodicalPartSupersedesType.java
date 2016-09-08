package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartSupersedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartSupersedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartSupersedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartSupersedesIterator thePeriodicalPartSupersedesIterator = (PeriodicalPartSupersedesIterator)findAncestorWithClass(this, PeriodicalPartSupersedesIterator.class);
			pageContext.getOut().print(thePeriodicalPartSupersedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

