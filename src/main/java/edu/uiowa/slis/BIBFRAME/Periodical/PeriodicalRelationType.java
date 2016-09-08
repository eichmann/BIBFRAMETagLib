package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalRelationIterator thePeriodicalRelationIterator = (PeriodicalRelationIterator)findAncestorWithClass(this, PeriodicalRelationIterator.class);
			pageContext.getOut().print(thePeriodicalRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for relation tag ");
		}
		return SKIP_BODY;
	}
}

