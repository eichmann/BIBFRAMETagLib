package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceHasDataSource extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceHasDataSource currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceHasDataSource.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceHasDataSourceIterator theFiniteResourceHasDataSourceIterator = (FiniteResourceHasDataSourceIterator)findAncestorWithClass(this, FiniteResourceHasDataSourceIterator.class);
			pageContext.getOut().print(theFiniteResourceHasDataSourceIterator.getHasDataSource());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

