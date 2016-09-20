package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalSupersedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalSupersedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalSupersedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalSupersedesIterator thePeriodicalSupersedesIterator = (PeriodicalSupersedesIterator)findAncestorWithClass(this, PeriodicalSupersedesIterator.class);
			pageContext.getOut().print(thePeriodicalSupersedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

