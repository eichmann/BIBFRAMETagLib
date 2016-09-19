package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceHasDataSourceInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceHasDataSourceInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceHasDataSourceInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceHasDataSourceInverseIterator theFiniteResourceHasDataSourceInverseIterator = (FiniteResourceHasDataSourceInverseIterator)findAncestorWithClass(this, FiniteResourceHasDataSourceInverseIterator.class);
			pageContext.getOut().print(theFiniteResourceHasDataSourceInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

