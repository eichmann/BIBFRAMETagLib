package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperHasDataSourceInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperHasDataSourceInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperHasDataSourceInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperHasDataSourceInverseIterator theNewspaperHasDataSourceInverseIterator = (NewspaperHasDataSourceInverseIterator)findAncestorWithClass(this, NewspaperHasDataSourceInverseIterator.class);
			pageContext.getOut().print(theNewspaperHasDataSourceInverseIterator.getHasDataSourceInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

