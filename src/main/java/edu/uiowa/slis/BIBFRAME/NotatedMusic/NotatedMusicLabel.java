package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NotatedMusic theNotatedMusic = (NotatedMusic)findAncestorWithClass(this, NotatedMusic.class);
			if (!theNotatedMusic.commitNeeded) {
				pageContext.getOut().print(theNotatedMusic.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			NotatedMusic theNotatedMusic = (NotatedMusic)findAncestorWithClass(this, NotatedMusic.class);
			return theNotatedMusic.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing NotatedMusic for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			NotatedMusic theNotatedMusic = (NotatedMusic)findAncestorWithClass(this, NotatedMusic.class);
			theNotatedMusic.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for label tag ");
		}
	}
}

