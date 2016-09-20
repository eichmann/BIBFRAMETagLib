package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartHasDataSourceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartHasDataSourceType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartHasDataSourceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartHasDataSourceIterator thePeriodicalPartHasDataSourceIterator = (PeriodicalPartHasDataSourceIterator)findAncestorWithClass(this, PeriodicalPartHasDataSourceIterator.class);
			pageContext.getOut().print(thePeriodicalPartHasDataSourceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

