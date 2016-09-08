package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextHasDataSourceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextHasDataSourceType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextHasDataSourceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextHasDataSourceIterator theTextHasDataSourceIterator = (TextHasDataSourceIterator)findAncestorWithClass(this, TextHasDataSourceIterator.class);
			pageContext.getOut().print(theTextHasDataSourceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

