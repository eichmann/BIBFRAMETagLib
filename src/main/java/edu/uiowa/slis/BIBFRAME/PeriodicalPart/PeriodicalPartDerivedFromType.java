package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartDerivedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartDerivedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartDerivedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartDerivedFromIterator thePeriodicalPartDerivedFromIterator = (PeriodicalPartDerivedFromIterator)findAncestorWithClass(this, PeriodicalPartDerivedFromIterator.class);
			pageContext.getOut().print(thePeriodicalPartDerivedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

