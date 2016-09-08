package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperHasDataSourceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperHasDataSourceType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperHasDataSourceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperHasDataSourceIterator theNewspaperHasDataSourceIterator = (NewspaperHasDataSourceIterator)findAncestorWithClass(this, NewspaperHasDataSourceIterator.class);
			pageContext.getOut().print(theNewspaperHasDataSourceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

