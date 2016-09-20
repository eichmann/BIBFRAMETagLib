package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalDerivedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalDerivedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalDerivedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalDerivedFromIterator thePeriodicalDerivedFromIterator = (PeriodicalDerivedFromIterator)findAncestorWithClass(this, PeriodicalDerivedFromIterator.class);
			pageContext.getOut().print(thePeriodicalDerivedFromIterator.getDerivedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

