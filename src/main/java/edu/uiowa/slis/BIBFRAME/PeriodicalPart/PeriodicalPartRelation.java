package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartRelationIterator thePeriodicalPartRelationIterator = (PeriodicalPartRelationIterator)findAncestorWithClass(this, PeriodicalPartRelationIterator.class);
			pageContext.getOut().print(thePeriodicalPartRelationIterator.getRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for relation tag ");
		}
		return SKIP_BODY;
	}
}

