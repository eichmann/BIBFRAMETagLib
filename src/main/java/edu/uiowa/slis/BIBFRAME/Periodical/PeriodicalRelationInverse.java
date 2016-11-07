package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalRelationInverseIterator thePeriodicalRelationInverseIterator = (PeriodicalRelationInverseIterator)findAncestorWithClass(this, PeriodicalRelationInverseIterator.class);
			pageContext.getOut().print(thePeriodicalRelationInverseIterator.getRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for relation tag ");
		}
		return SKIP_BODY;
	}
}
