package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasDataSourceInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalHasDataSourceInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasDataSourceInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasDataSourceInverseIterator thePeriodicalHasDataSourceInverseIterator = (PeriodicalHasDataSourceInverseIterator)findAncestorWithClass(this, PeriodicalHasDataSourceInverseIterator.class);
			pageContext.getOut().print(thePeriodicalHasDataSourceInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

