package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartHasDataSourceInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartHasDataSourceInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartHasDataSourceInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartHasDataSourceInverseIterator thePeriodicalPartHasDataSourceInverseIterator = (PeriodicalPartHasDataSourceInverseIterator)findAncestorWithClass(this, PeriodicalPartHasDataSourceInverseIterator.class);
			pageContext.getOut().print(thePeriodicalPartHasDataSourceInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

