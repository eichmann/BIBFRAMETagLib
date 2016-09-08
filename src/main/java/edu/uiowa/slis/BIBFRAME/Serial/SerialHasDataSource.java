package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialHasDataSource extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialHasDataSource currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialHasDataSource.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialHasDataSourceIterator theSerialHasDataSourceIterator = (SerialHasDataSourceIterator)findAncestorWithClass(this, SerialHasDataSourceIterator.class);
			pageContext.getOut().print(theSerialHasDataSourceIterator.getHasDataSource());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

