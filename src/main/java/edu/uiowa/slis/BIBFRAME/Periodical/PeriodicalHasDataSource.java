package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasDataSource extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalHasDataSource currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasDataSource.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasDataSourceIterator thePeriodicalHasDataSourceIterator = (PeriodicalHasDataSourceIterator)findAncestorWithClass(this, PeriodicalHasDataSourceIterator.class);
			pageContext.getOut().print(thePeriodicalHasDataSourceIterator.getHasDataSource());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

