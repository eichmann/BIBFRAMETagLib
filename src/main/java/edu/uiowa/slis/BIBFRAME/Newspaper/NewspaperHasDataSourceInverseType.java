package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperHasDataSourceInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperHasDataSourceInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperHasDataSourceInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperHasDataSourceInverseIterator theNewspaperHasDataSourceInverseIterator = (NewspaperHasDataSourceInverseIterator)findAncestorWithClass(this, NewspaperHasDataSourceInverseIterator.class);
			pageContext.getOut().print(theNewspaperHasDataSourceInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

