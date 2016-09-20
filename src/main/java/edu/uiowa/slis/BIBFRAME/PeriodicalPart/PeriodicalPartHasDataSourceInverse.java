package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartHasDataSourceInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartHasDataSourceInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartHasDataSourceInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartHasDataSourceInverseIterator thePeriodicalPartHasDataSourceInverseIterator = (PeriodicalPartHasDataSourceInverseIterator)findAncestorWithClass(this, PeriodicalPartHasDataSourceInverseIterator.class);
			pageContext.getOut().print(thePeriodicalPartHasDataSourceInverseIterator.getHasDataSourceInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

