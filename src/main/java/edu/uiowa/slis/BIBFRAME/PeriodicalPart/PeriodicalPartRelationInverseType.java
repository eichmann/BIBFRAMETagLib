package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartRelationInverseIterator thePeriodicalPartRelationInverseIterator = (PeriodicalPartRelationInverseIterator)findAncestorWithClass(this, PeriodicalPartRelationInverseIterator.class);
			pageContext.getOut().print(thePeriodicalPartRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for relation tag ");
		}
		return SKIP_BODY;
	}
}

