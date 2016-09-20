package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartRelationInverseIterator thePeriodicalPartRelationInverseIterator = (PeriodicalPartRelationInverseIterator)findAncestorWithClass(this, PeriodicalPartRelationInverseIterator.class);
			pageContext.getOut().print(thePeriodicalPartRelationInverseIterator.getRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for relation tag ");
		}
		return SKIP_BODY;
	}
}

