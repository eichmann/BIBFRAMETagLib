package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartSupersedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartSupersedes currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartSupersedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartSupersedesIterator thePeriodicalPartSupersedesIterator = (PeriodicalPartSupersedesIterator)findAncestorWithClass(this, PeriodicalPartSupersedesIterator.class);
			pageContext.getOut().print(thePeriodicalPartSupersedesIterator.getSupersedes());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

